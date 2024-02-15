import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> idxMap = new HashMap<>();
        int len = nums.length;
        for (int idx = 0; idx < len; idx++) {
            Integer beforeIdx = idxMap.get(nums[idx]);
            if (beforeIdx != null) {
                if (idx - beforeIdx <= k) return true;
            }
            idxMap.put(nums[idx], idx);
        }
        return false;
    }
}
