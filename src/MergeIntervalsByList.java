import java.util.*;

public class MergeIntervalsByList {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = merge(intervals);
        for (int[] resultArray: result) {
            for (int resultInt:resultArray) {
                System.out.print(resultInt);
            }
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[0]));
        LinkedList<int[]> res = new LinkedList<>();
        for(int[] interval : intervals){
            if(res.isEmpty() || res.getLast()[1] < interval[0]){
                res.add(interval);
            }else{
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
            }
        }
        return res.toArray(new int[res.size()][0]);
    }
}
