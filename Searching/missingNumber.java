package Searching;

// import java.util.HashMap;

// public class missingNumber {
//     class Solution {
//     public int missingNumber(int[] nums) {
        
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0 ; i < nums.length ; i++){
//             map.put(nums[i] , i);
//         }

//         for(int i = 0 ; i < nums.length; i++){
//             if(!map.containsKey(i)){
//                 return i;
//             }
//         }
//         return nums.length ;
//     }
// }
    
// }


// below code is the more optimal one 

public class missingNumber{
class Solution {
    public int missingNumber(int[] nums) {
int tot = 0; 
        for(int i = 0 ; i <= nums.length ;  i++){
tot += i;
        }

        for(int i = 0 ;  i < nums.length ; i++){
            tot -= nums[i];
        }
        
    return tot;
    }

}
    
}

// 
