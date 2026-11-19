class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        int left = 0;
        int right= nums.length- 1;

        for(int i = 0 ; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int pos = nums.length - 1; pos >=0 ; pos--){
            if(nums[left] < nums[right]){
                res[pos] = nums[right];
                right--;
            }else{
                res[pos] = nums[left];
                left++;
            }
        }
    return res;
    }
}