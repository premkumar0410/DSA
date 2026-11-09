class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smallest = nums1.length <= nums2.length ? nums1 : nums2;
        int[] largest  = nums1.length <= nums2.length ? nums2 : nums1;
        int total = smallest.length + largest.length;


        int left = 0 ; 
        int right  = smallest.length;

        while(left <= right){
            int midA = (left + right) / 2 ;
            int midB = (total + 1 ) / 2 - midA;
            

            int l1 = midA == 0 ? Integer.MIN_VALUE : smallest[midA - 1];
            int l2 = midB == 0 ? Integer.MIN_VALUE : largest[midB - 1];

            int r1 = midA == smallest.length ? Integer.MAX_VALUE : smallest[midA];
            int r2 = midB == largest.length ? Integer.MAX_VALUE : largest[midB];


            if(l1 <= r2 && l2 <= r1){
                if(total % 2 == 0){
                    return (double)(Math.max(l1 , l2) + Math.min(r1,r2)) / 2.0;
                    //even
                }else{
                    return (double)Math.max(l1,l2) ;
                    //odd
                }
            }

            if(l1 > r2){
                right = midA - 1;
            }else{
                left = midA + 1;
            }
        }

        return 0;
    }
}