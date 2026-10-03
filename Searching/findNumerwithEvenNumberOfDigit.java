package Searching;

public class findNumerwithEvenNumberOfDigit {
    class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
              int length =  String.valueOf(n).length();
               if(length % 2 == 0 ){
                count++;
               }
        }
        return count;
    }
}
    
}


// sloved by converting into string to find the length of teach itreation 