class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i = 1 ; i < n ; i++){
            result[i] = result[i -1] * nums[i - 1];
        } 

        int suffix = 1; 
        for(int i = n -1 ; i >= 0 ; i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }


        return result;
    }
}


// brute force work for certain test cases not for all 
// complted using prefix suffix method (Ref note to understand if forgot)
// // prefix and suffix 
// ex  : nums = {-1 , 1, 0 , -3 , 3 }
//                0   1  2    3   4


// i = 2 (0)
// prefix :
//      -1 * 1 == -1  --- will be the prefix one 
     
// suffix :
//     -3 * 3 = -9 ----- suffix one 

// now : prefix * suffix  === -1 * -9 == 9 

// in simple term's this how it works 