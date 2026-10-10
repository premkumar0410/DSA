package BinarySeach;

public class FindFirstAndLastPOssitionOfElementInSortedArray {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = find(nums, target , true);
        int right = find(nums,target, false);

        return new int[]{left , right};
    }

    private int find(int[] nums, int target , boolean isFirst){

        int index = -1 ;
        int left = 0 ;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                index = mid;
                if(isFirst){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

return index;
    }
}
    
}
// solved using binary search algo.