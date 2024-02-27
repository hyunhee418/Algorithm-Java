import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
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
        List<int[]> resultList = new ArrayList<>();
        while (i < len) {
            int[] interval = intervals[i];
            int start = interval[0];
            int end = interval[1];
            int j = 0;
            while (i + j + 1 < len && intervals[i+j+1][0] <= start && intervals[i+j+1][1] >= start) {
                j++;
            }
            if (start >= intervals[i + j][1]) {
                start = intervals[i + j][0];
                interval[0] = start;
            }
            j = 0;
            while (i + j + 1< len && start <= intervals[i + j + 1][0] && end >= intervals[i + j + 1][0]) {
                j++;
            }
            if (end < intervals[i + j][1]) {
                end = intervals[i + j][1];
                interval[1] = end;
            }
            resultList.add(interval);
            i = 1;
        }
        int[][] result = new int[resultList.size()][2];
        for (int ri =0; ri<resultList.size();ri++) {
            result[ri][0] = resultList.get(ri)[0];
            result[ri][1] = resultList.get(ri)[1];
        }
        return result;
    }
}
