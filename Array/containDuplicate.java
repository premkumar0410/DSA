import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        

        for(int i=1 ; i < nums.length ; i++){
           if(nums[i] == nums[i - 1]){
            return true;
           }
        }
        return false;
        
    }
}


// This is optimal compare to 2 for loops.
// more optimal solution is hadmap and set.
// there are more advance concept to solve this but it not for bigineeer so live it for now will lean it in the future (refernece in leetcode solution).