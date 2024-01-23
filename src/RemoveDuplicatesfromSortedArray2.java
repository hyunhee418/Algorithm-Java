public class RemoveDuplicatesfromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int count = 1;
        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] != nums[idx-1]) {
                nums[k] = nums[idx];
                k++;
                count = 1;
            } else {
                if (count < 2) {
                    nums[k] = nums[idx];
                    k++;
                    count++;
                }
            }
        }
        return k;
    }


}
