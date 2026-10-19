// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i < nums.length - 1 ;i++){
//             for(int j = i + 1 ; j < nums.length;j++){
//                 if (nums[i] + nums[j] == target){
//                     return new int[]{i,j};
                   
                  
//                 }
//             }
//         }
//     //     return result;
//     return new int[]{};
    
// }}


// this the brute force 
// time complexity o(n^2)
// optimal will be hashmap will do that in sometime...

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int required =  target - nums[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            map.put( nums[i] , i);

        }
        return new int[]{0,0};
    }
}

// this is the optimal solution  we use hashmap storing num[i] as key and the index value as value.