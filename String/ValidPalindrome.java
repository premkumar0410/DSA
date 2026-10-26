class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();

        StringBuilder reverse = new StringBuilder();

        for(int i = s.length() - 1 ; i >= 0 ; i--){
            reverse.append(s.charAt(i));
        }

        if(s.equals(reverse.toString())){
            return true;
        }

         return false;
        
    }

   
}