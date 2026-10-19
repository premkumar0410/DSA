import java.util.HashMap;

public class firstMissingPositive {
    class Solution {
    public int firstMissingPositive(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(i > 0 && i <= nums.length){
                map.put(i,i);
            }
        }

        for(int i  = 1 ; i<= nums.length ; i++){
            if(!map.containsKey(i)){
                return i; 
            }
        }
        return nums.length + 1;
    }
}
    
}



// solved but need to try again with more efficient solution 