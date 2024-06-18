import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] intervals = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(intervals);
        for (List<Integer> resultArray: result) {
            for (int resultInt:resultArray) {
                System.out.print(resultInt);
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        int len = nums.length;
        int i = 0;
        while (i < len-2) {
            if (i == 0 || nums[i] != nums[i-1]) {
                int j = i + 1;
                int k = len - 1;
                while (j < k) {
                    int total = nums[i] + nums[j] + nums[k];
                    if (total == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j + 1 < len && nums[j] == nums[j+1]) {
                            j++;
                        }
                        while (k - 1 > j && nums[k] == nums[k-1]) {
                            k--;
                        }
                        j++;
                        k--;
                    } else if (total < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
            i++;
        }
        return result;
    }
}
