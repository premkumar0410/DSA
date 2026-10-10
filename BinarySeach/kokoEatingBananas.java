package BinarySeach;

public class kokoEatingBananas {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 ; 

        int right = 0;

        for(int i : piles){
            if(i > right ){
                right = i;
            }
        }

        while(left < right ){
            int mid = left + (right - left)/ 2;

            if(isEatable(piles, h,mid)){
                right = mid  ;

           }else{
                left = mid + 1;
            }
        }
        return left;
        
    }

    public boolean isEatable(int[] piles , int h , int speed){
        int hour =  0;
        for(int n : piles){
            hour += (int) Math.ceil((double)n / speed);
        }

        return hour <= h;
    }
}
    
}
