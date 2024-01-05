public class MinimumSizeSubarraySum_RecursionFunction {
    private static int minLength = 100000;
    public static int minSubArrayLen(int target, int[] nums) {
        int result = findMinLength(target, nums, 0, 0, 0);
        if (result == 100000) return 0;
        return result;
    }

    private static int findMinLength(int target, int[] nums, int startIndex, int endIndex, int total) {
        if (startIndex == nums.length && endIndex == nums.length) return minLength;
        if (target <= total && minLength > endIndex - startIndex) minLength = endIndex - startIndex;
        if (target <= total || endIndex == nums.length) {
            return findMinLength(target, nums, startIndex + 1, startIndex + 1, 0);
        }
        return findMinLength(target, nums, startIndex, endIndex + 1, total + nums[endIndex]);
    }


    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(target, nums));
    }
}
