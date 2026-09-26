class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        }

        return res;        
    }
}

// solved using kadane's algorithm need to see that again 
// this can be solved by two methos one is kadane' algorithm and divide and conquer method 