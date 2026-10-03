package Searching;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        if(nums.length == 0){
            return nums[0];
        }
        int max = 0;
        int max_ = 0;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i : nums){
            int count = map.getOrDefault(i , 0);

            if(map.containsKey(i)){
                count++;
            }
            map.put(i,count);

            if(count > max){
                max = count;
                max_ = i;
            }

        }
        return max_;
    }
} 

// solved using hasmap concept can be ref here aswell if don't understand;
    

