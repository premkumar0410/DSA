class Solution {
    public int heightChecker(int[] heights) {

        int[] arr = heights.clone();

        int size = heights.length;
        int count = 0;

        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j < size - i - 1; j++ ){
                if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp ; 
                }
            }
        }


        for(int i = 0 ; i < size ; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }



        return count;
    }
}