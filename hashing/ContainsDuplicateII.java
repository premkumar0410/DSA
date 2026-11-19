import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean ans = false;
        for(int i = 0 ; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                if(i - map.get(arr[i]) <=k){
                    ans = true;
                    break;
                }
            }
            map.put(arr[i],i);
            
        }
        return ans;
    }
}