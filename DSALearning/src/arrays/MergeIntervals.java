package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals   {

    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }

    }

    public static int[] [] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int i=1; i< intervals.length; i++){
            int[] last = result.get(result.size()-1);
            int[] current = intervals[i];

            if(current[0] <= last[1]){
                last[1] = Math.max(last[1],current[1]);
            }
            else {
                result.add(current);
            }
        }
        return result.toArray(new int[result.size()][]);

    }
 }

 // Time complexity = O(n log n)
//  Space complexity = O(n)
// Logic= Sort → Compare with last → Merge if overlap → Else add


