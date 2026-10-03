package Searching;

public class ThirdMaxNumber {
    class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer sec_max = null;
        Integer thr_max = null;

        for(Integer num : nums){

            if(num.equals(max) || num.equals(sec_max) || num.equals(thr_max)){
                continue;
            }

            if(max == null || num > max){
                thr_max = sec_max;
                sec_max = max;
                max = num;
            }else if(sec_max == null || num > sec_max){
                thr_max = sec_max;
                sec_max = num;
            }else if(thr_max == null || num > thr_max){
                thr_max = num;
            }
        }
        if(thr_max == null){
            return max;
        }

        return thr_max;
        
    }
}
    
}



// solved using brute force 
// can be solved more efficiently using heap that is still need to learn 