package Searching;

import java.util.Arrays;


// brute force 
// public class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         Arrays.sort(nums);
//         for(int i = 0 ; i < n ; i++){
//             if(i != nums[i]){
//                 return i;
//             }
//         }

//         if(nums[n - 1] != n){
//             return n;
//         }
//         return 0;
//     }
// } 


// Efficient one using (n * (n + 1) ) / 2 to find the total of the length
// then subract each value in the array to get the missing value 
// class Solution {
//     public int missingNumber(int[] nums) {

//         int n = nums.length;

//         int total = (n * (n + 1)) / 2 ;

//         for(int i = 0 ; i < nums.length; i++){
//             total -= nums[i];
//         }

//         return total;

        
        
//     }
// }


// using zor operation for more optimal solution o(n) o(1)
// can be refered in note the login clearly 
class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0;

        for(int i = 0 ; i <= nums.length; i++){
            xor = xor ^ i;
        }

        for(int i : nums){
            xor = xor ^ i;
        }

        return xor;
        
    }
}
 

