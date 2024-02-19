import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7 ,7};

        int[] result = twoSum(nums, 9);
        for (int ele:result) {
            System.out.print(ele);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer search = map.get(target - nums[i]);
            if (search != null) {
                result[0] = search;
                result[1] = i+1;
            }
            map.put(nums[i], i+1);
        }
        return result;
    }
}
