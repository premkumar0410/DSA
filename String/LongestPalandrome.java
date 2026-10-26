class Solution {
    public String longestPalindrome(String s) {
        int max = 0 ;
        String max_pal ="";


        for(int i = 0 ; i< s.length(); i++){
           String pal_o = isPal(s , i , i );
           String pal_e = isPal(s, i , i+1);
                // if(pal.length() > max){
                //     max = pal.length();
                //     max_pal = pal;
                // }

            if(pal_o.length() > pal_e.length() && pal_o.length() > max){
                max = pal_o.length();
                max_pal = pal_o;
                
            }else if (pal_e.length() > pal_o.length() && pal_e.length() > max){
                max = pal_e.length();
                max_pal = pal_e;
            }
        }

        return max_pal;

        
    }

        public static String isPal(String s , int left , int right ){
        if(left < 0 || right >= s.length()){
            return "";
        }
        String ss = "";
   

        while(left >= 0 && right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
                break;
            }
            ss = s.substring(left , right + 1);
            left--;
            right++;
        }
        
    return ss;
        }
}