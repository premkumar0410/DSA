public class capacityToShipPackageWithinDDays {
    class Solution {
    public int shipWithinDays(int[] weights, int d) {

        int left = 0;
        int right = 0;

        for(int i : weights){
            left = Math.max(left , i);
            right += i;
            
        }

        while(left < right){
            int mid = left + (right - left) / 2 ;

            int days = 1 ; 
            int sum = 0 ; 
            for(int i : weights){
                if(sum + i > mid){
                    days++;
                    sum =0;
                }
                sum += i;
            }


            if (days <= d) {
    right = mid;   // capacity works, try smaller
} else {
    left = mid + 1; // capacity too small, need bigger
}


        }

        
        


      return left;  
    }
}
    
}


// need to solve this again to understand the problem statement wihtout YT videos.
