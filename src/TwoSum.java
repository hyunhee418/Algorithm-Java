public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 11, 15, 7 ,7};

        int[] result = twoSum(nums, 9);
        for (int ele:result) {
            System.out.print(ele);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int len = nums.length;
        boolean isStop = false;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    isStop = true;
                    break;
                }
            }
            if (isStop) break;
        }
        return result;
    }
}
