public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {1,2,3,4,2,1};
        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int minValue = 100000;
        int startIdex=0, endIdex=0;
        while (startIdex<nums.length) {
            total += nums[startIdex];
            while (endIdex < startIdex && (total - nums[endIdex]) >= target){
                total -= nums[endIdex];
                endIdex ++;
            }

            if (total >= target) minValue = Math.min(minValue, startIdex - endIdex + 1);
            startIdex++;
        };
        if (minValue == 100000) return 0;
        return minValue;
    }

}
