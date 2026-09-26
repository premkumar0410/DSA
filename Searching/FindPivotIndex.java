package Searching;


// brute force 
// class Solution {
//     public int pivotIndex(int[] nums) {

       

//         for(int i= 0 ; i < nums.length; i++){
//             int leftsum = left(0,i,nums);
//            int rightsum = right(i + 1 , nums.length,nums);

//            if(leftsum == rightsum){
//             return i;
//            }
//         }

//         return -1;
        
//     }
//     public int right(int start,int end,int[] nums){
//             // if(end == 0){
//             //     return 0;
//             // }

//             int r_sum = 0;
//             for(int i = start; i < end ; i++){
             
//                 r_sum += nums[i];
//             }
// //    System.out.println(l_sum);
//             return r_sum;
//         }

//      public int left(int start,int end,int[] nums){
//             // if(end == 0){
//             //     return 0;
//             // }

//             int l_sum = 0;
//             for(int i = start; i < end ; i++){
             
//                 l_sum += nums[i];
//             }
//    System.out.println(l_sum);
//             return l_sum;
//         }

// }

// solved still needs to optimized 


// this is the optimal solution 

class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0 ;
        int rightsum  = 0 ;

        for(int i : nums){
            rightsum += i;
        }
        

        for(int i = 0 ; i < nums.length; i++){
            rightsum -= nums[i];
            if(leftsum == rightsum){
                return i;
            } else {
                leftsum += nums[i];
            }
        }

        return -1;
        
    }
}
