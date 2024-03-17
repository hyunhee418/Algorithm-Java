import java.util.*;

import static java.util.List.copyOf;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {5,5}, {3,5}, {4,6}, {1,1}, {3,3}, {5,6}, {3,3}, {2,4}, {0,0}};
        int[][] result = merge(intervals);
        for (int[] resultArray: result) {
            for (int resultInt:resultArray) {
                System.out.print(resultInt);
            }
        }
    }
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        int i = 0;
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[1]));
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[0]));
        List<int[]> resultList = new ArrayList<>();
        while (i < len) {
            int[] interval = intervals[i];
            int end = interval[1];
            int j = i;
            while (j+1 < len && end >= intervals[j+1][0]) {
                if  (end <= intervals[j+1][1]) {
                    end = intervals[j + 1][1];
                }
                j++;
            }
            interval[1] = end;
            if (resultList.isEmpty() || resultList.get(resultList.size()-1)[1] < interval[0]) resultList.add(interval);
            i = j+1;
        }
        int[][] result = new int[resultList.size()][2];
        for (int ri =0; ri<resultList.size();ri++) {
            result[ri][0] = resultList.get(ri)[0];
            result[ri][1] = resultList.get(ri)[1];
        }
        return result;
    }
}
