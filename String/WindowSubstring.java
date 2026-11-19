class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] count = new int[128];

        for(char ch : t.toCharArray()){
            count[ch]++;
        }

        int left =0 ;
        int right =0;
        int req = t.length();
        int minlen = Integer.MAX_VALUE;
        int start = 0;

        while(right < s.length()){
            char ch = s.charAt(right);

            if(count[ch] > 0){
                req--;
            }
            count[ch]--;

            right++;

            while(req == 0){
                if(right - left < minlen){
                    minlen = right-left;
                    start = left;
                }

                char remove = s.charAt(left);

                count[remove]++;

                if(count[remove] > 0){
                    req++;
                }

                left++;
            }
        } 
return minlen == Integer.MAX_VALUE ? ""  : s.substring(start, start + minlen);
    }  
}