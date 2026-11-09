class Solution {
    public int countSubstrings(String s) {
        int sum = 0;

        for(int i = 0 ; i < s.length() ; i++){
            int odd = help(s , i , i);
            int even = help(s, i , i+1);

            sum += odd + even;
             
        }

        return sum;
    }

    public int help(String s  , int left , int right){
        int count = 0;
        while(left >= 0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
               break;
            }
            count++;
            left--;
            right++;
        }
        return count;
    }
}