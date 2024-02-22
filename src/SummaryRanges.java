import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> result = summaryRanges(nums);
        System.out.println(result);

    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int start = nums[i];
            int j = 0;
            while (i+j+1 < len && nums[i+j] + 1 == nums[i+j+1]) {
                j++;
            }
            int end = nums[i+j];
            if (j != 0) {
                result.add(String.format("%s->%s", start, end));
            }
            if (j == 0) {
                result.add(String.format("%s", start));
            }
            i = i+j+1;
        }
        return result;
    }
}
