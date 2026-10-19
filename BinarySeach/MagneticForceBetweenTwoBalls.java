class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);
        int ans = 0 ;
        int left = 1;
        int right =position[position.length - 1] - position[0];

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canPlace(mid , position , m )){
                ans = mid;
                left = mid + 1;

          }else{
                right = mid -1;
            }
        }
        return ans;
    }
    public boolean canPlace(int mid , int[] nums , int m){
        int count = 1;
        int last = nums[0];

        for(int i = 1; i < nums.length ; i++){
            if(nums[i] - last >= mid){
                count++;
                last = nums[i];
            }
        }

        if(count >= m){
            return true;
        }

        return false;
    }
}