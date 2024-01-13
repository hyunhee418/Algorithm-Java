import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] != nums[idx-1]) {
                nums[k] = nums[idx];
                k++;
            }
        }
        return k;
    }


}
