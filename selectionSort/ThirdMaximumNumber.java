class Solution {
    public int thirdMax(int[] nums) {



        for(int i = 0 ; i < nums.length; i++){
            int min = i;
            for(int j = i +1 ; j < nums.length ; j++){
                if(nums[j] < nums[min]){
                    min = j ;
                }
            }

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }


        int dist = 1 ; 
        int last = nums[nums.length - 1];

        for(int i = nums.length - 2 ;i >= 0; i--){
            if(nums[i] != last){
                dist++;
                last = nums[i];
            }

            if(dist ==3){
                return nums[i];
            }
        }
        return nums[nums.length -1] ;
    }
}