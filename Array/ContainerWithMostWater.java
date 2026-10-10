public class ContainerWithMostWater {
    class Solution {
    public int maxArea(int[] height) {

        int left = 0 ; 
        int right = height.length - 1;
        int len =  height.length - 1;
        int max = Integer.MIN_VALUE;

        while(left < right){

        int min = Math.min(height[left] , height[right]);

        if(min * len > max){
            max = min * len;
        } 

        if(height[left] < height[right]){
            left = left +1;
        }else{
            right = right -1;
        }

        len = len - 1;
        }


        return max;
        
    }
}
    
}


// solved using two poiinter can be more optimized in future 