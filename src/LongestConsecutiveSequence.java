import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int len = nums.length;

        Map<Integer, Integer> map = new HashMap<>(Map.of(nums[0] + 1, 1));
        for (int idx = 0; idx < nums.length; idx++) {
            map.put(nums[idx]+1, map.getOrDefault(nums[idx], 0)+1);
        }
        return map.values().stream().max(Comparator.comparing(x -> x)).get();
    }

}
