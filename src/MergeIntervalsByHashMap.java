import java.util.*;

public class MergeIntervalsByHashMap {
    public static void main(String[] args) {
        int[][] intervals = {{2,3}, {4,6}, {5,7}, {3,4}};
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
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[0]));
        Map<Integer, Integer> resultMap = new HashMap<>();
        while (i < len) {
            int[] interval = intervals[i];
            int cstart = interval[0];
            int cend = interval[1];
            boolean isChange = false;
            for (Map.Entry<Integer, Integer> resultEntry:List.copyOf(resultMap.entrySet())) {
                int start = resultEntry.getKey();
                int end = resultEntry.getValue();
                if (cstart < start) {
                    if (cend >= start) {
                        resultMap.remove(start);
                        resultMap.put(cstart, end);
                        start = cstart;
                        isChange = true;
                    }
                }
                if (cstart <= end ) {
                    if (cend > end) {
                        resultMap.put(start, cend);
                        isChange = true;
                    } else if (cend >= start) {
                        isChange = true;
                    }
                }
            }
            if (!isChange) resultMap.put(cstart, cend);
            i++;
        }
        int[][] result = new int[resultMap.size()][2];
        int ri =0;
        for (Map.Entry<Integer, Integer> resultEntry:resultMap.entrySet()) {
            result[ri][0] = resultEntry.getKey();
            result[ri][1] = resultEntry.getValue();
            ri++;
        }
        return result;
    }
}
