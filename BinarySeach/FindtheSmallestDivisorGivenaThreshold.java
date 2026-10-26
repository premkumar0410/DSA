class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        for(int n : nums){
            if(n > right){
                right = n;
            }
        }


        while(left <= right){
            int mid = left + (right - left) / 2;

            if(sumOfD(nums , mid) <= threshold){
                right = mid -  1;
            }else{
                left = mid + 1;
            }
        }
        return left ;
    }

    public int sumOfD(int[] nums , int mid){
        int sum = 0 ; 

        for(int i : nums){
            sum += (int) Math.ceil((double) i / mid);
        }
        return sum;
    }
}