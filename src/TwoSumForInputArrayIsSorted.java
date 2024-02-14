import java.util.HashMap;
import java.util.Map;

public class TwoSumForInputArrayIsSorted {
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
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int search = target - nums[i];
            if (map.containsKey(search)) {
                result[0] = map.get(result);
                result[1] = i+1;
                return result;
            }
            map.put(nums[i], i+1);
        }
        return result;
    }
}
