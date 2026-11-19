import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) { 
        HashMap<Integer , Integer> freq = new HashMap<>();
        
        for(int i : arr1){
            freq.put(i , freq.getOrDefault(i , 0) + 1);
        }
        // System.out.println(freq);

        int[] res = new int[arr1.length];
        int k = 0 ;

        for(int i : arr2){
            int count = freq.get(i);

            while(count > 0){
                res[k] = i;
                k++;
                count--;
            }
            freq.remove(i);
        }

        ArrayList<Integer> rem = new ArrayList<>();

        for(int i : freq.keySet()){
            int count = freq.get(i);
            while(count > 0){
                rem.add(i);
                count--;
            }
        } 

        Collections.sort(rem);

        for(int i : rem){
            res[k] = i;
            k++;

        }
        return res;
    }
}