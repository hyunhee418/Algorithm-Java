import java.util.*;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        int val = 3;
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        List<Integer> result = new ArrayList<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != val) {
                result.add(nums[idx]);
            }
        }
        IntStream.range(0, result.size()).forEach(idx -> {nums[idx] = result.get(idx);});
        return result.size();
    }
}
