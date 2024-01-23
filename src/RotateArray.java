public class RotateArray {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1,2};
        int[] result = rotate(nums, k);
        for (int ele:result) {
            System.out.print(ele);
        }
    }
    public static int[] rotate(int[] nums, int k) {
        int size = nums.length;
        int[] temp = new int[size];
        k = k % size;
        for (int idx =0; idx < size; idx ++) {
            temp[idx] = nums[(size - k + idx) % size];
        }
        for (int idx =0; idx < size; idx ++) {
            nums[idx] = temp[idx];
        }
        return temp;
    }
}
