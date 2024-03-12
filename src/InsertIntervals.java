import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{0,5}, {9,12}};
        int[] newInterval = {7,16};
        int[][] result = insert(intervals, newInterval);
        for (int[] resultArray: result) {
            for (int resultInt:resultArray) {
                System.out.print(resultInt);
            }
            System.out.println();
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[1] < newInterval[0]) {
                mergedIntervals.add(interval);
            }
            else if (interval[0] > newInterval[1]) {
                mergedIntervals.add(newInterval);
                newInterval = interval;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        mergedIntervals.add(newInterval);

        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}
