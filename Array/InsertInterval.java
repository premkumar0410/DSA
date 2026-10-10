import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> arr = new ArrayList<>();
        List<int[]> result = new ArrayList<>();

        for(int[] i : intervals){
            arr.add(i);
        }
        arr.add(newInterval);

        arr.sort(Comparator.comparingInt(i -> i[0]));


        newInterval = arr.get(0);
        result.add(newInterval);

        for(int[] i : arr){
            if(i[0] <= newInterval[1]){
                newInterval[1] = Math.max(i[1] , newInterval[1]);
            }else{
                newInterval = i;
                result.add(i);
            }
        }

    


 return result.toArray(new int[result.size()] []);
        
    }
}
    
}


//  need to tyr again in a week or so to understand the concept properly 