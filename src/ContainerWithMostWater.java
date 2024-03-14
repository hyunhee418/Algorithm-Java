public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.print(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int maxAmount = 0;
        int i = 0;
        int j = height.length-1;
        while (i < j) {
            int iHeight = height[i];
            int jHeight = height[j];
            int x = j-i;
            if (maxAmount/x < jHeight) {
                int amount = x * (Math.min(jHeight, iHeight));
                maxAmount = Math.max(maxAmount, amount);
            }
            if (jHeight > iHeight) i++;
            else j--;
        }
        return maxAmount;
    }
}
