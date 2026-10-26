
class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0 ; 
        int right = 0 ;

        for(int i : nums){
            left = Math.max(i , left);
            right += i;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canSplit(nums,k,mid)){
                right = mid -1;

            }else{
                left = mid + 1;
            }
        }
        return left ;
    }

    public boolean canSplit(int[] nums , int k , int mid){
        int noOfSplit = 1;
        int curCount = 0;

        for(int i : nums){
            curCount += i;
            if(curCount > mid){
                noOfSplit += 1;
                curCount = i;
            }
        }

        if(noOfSplit <= k){
            return true;
        }

        return false;
    }
}