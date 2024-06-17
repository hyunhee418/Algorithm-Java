import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinimunNumberOfArrowsToBurstBallons {
    public static void main(String[] args) {
        int[][] intervals = {{10,16}, {2,8}, {1,6}, {7,12}};
        int result = findMinArrowShots(intervals);
        System.out.print(result);

    }
    public static int findMinArrowShots(int[][] intervals) {
        int len = intervals.length;
        int i = 0;
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[1]));
        Arrays.sort(intervals, Comparator.comparingInt((int[] array) -> array[0]));
        List<int[]> resultList = new ArrayList<>(Arrays.asList(intervals[0]));
        while (i < len) {
            int[] interval = resultList.get(resultList.size()-1);
            int end = interval[1];
            if (i+1 < len) {
                if (end >= intervals[i+1][0]) {
                    interval[0] = intervals[i + 1][0];
                    interval[1] = Math.min(intervals[i + 1][1], interval[1]);
                } else {
                    resultList.add(intervals[i+1]);
                    i++;
                }
            }
            i++;
        }
        return resultList.size();
    }
}
