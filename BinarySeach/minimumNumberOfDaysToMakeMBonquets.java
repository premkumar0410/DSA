class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

            if(m*k > bloomDay.length){
                return -1;
            }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : bloomDay){
            min = Math.min(i , min);
            max = Math.max(i , max);
        }

    

        for(int i = min ; i <= max ; i++){
            if(possible(bloomDay,i,m,k)){
                return i;
            }

        }
        return -1;
    }

    public boolean possible(int[] arr , int i , int m ,int k){
        int count = 0;
        int bonq = 0 ;
        for(int day : arr){
            if(day <= i){
                count++;
            }else{
                bonq += (count / k);
                count = 0;
            }
        }
        bonq += (count / k);

        if(bonq >= m){
            return true;
        }

        return false;
    }
}

// the above code is the brute force method need to optimized solution which is binary search. 


class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

            if((long)m*k > bloomDay.length){
                return -1;
            }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : bloomDay){
            min = Math.min(i , min);
            max = Math.max(i , max);
        }

            while(min < max){
                int mid = min + (max - min )/2;

                if(possible(bloomDay,mid , m , k)){
                    max = mid;
                }else{
                    min = mid + 1;
                }
            }
    

        // for(int i = min ; i <= max ; i++){
        //     if(possible(bloomDay,i,m,k)){
        //         return i;
        //     }

        // }
        return max;
    }

    public boolean possible(int[] arr , int i , int m ,int k){
        int count = 0;
        int bonq = 0 ;
        for(int day : arr){
            if(day <= i){
                count++;
            }else{
                bonq += (count / k);
                count = 0;
            }
        }
        bonq += (count / k);

        if(bonq >= m){
            return true;
        }

        return false;
    }
}


// the above one is optimal solution. 