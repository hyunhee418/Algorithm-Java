import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(String.valueOf(majorityElement(nums)));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(Map.of(nums[0], 1));
        int result = nums[0];
        int maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
                if (count > maxCount) {
                    result = nums[i];
                    maxCount = count;
                }
            } else {
                map.put(nums[i], 1);
            }
        }
        return result;
    }
}
