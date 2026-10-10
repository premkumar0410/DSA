package BinarySeach;

public class MoveZeros {
    class Solution {
    public void moveZeroes(int[] nums) {

        int initPosition = 0 ;

        for(int num : nums){
            if(num != 0){
                nums[initPosition++] = num;
            }
        }

        while(initPosition < nums.length){
            nums[initPosition++] = 0;
        }
        
    }
}
    
}



// solved 