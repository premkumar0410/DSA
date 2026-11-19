class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for(int i : nums1){
            num1.add(i);
        }

        for(int i : nums2){
            if(num1.contains(i)){
                res.add(i);
            }
        }

        int[] ans = new int[res.size()];
        int j = 0;

        for(int i : res){
            ans[j++] = i;
        }
       
       
       return ans;
    }
}