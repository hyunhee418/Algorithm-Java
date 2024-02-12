public class IntegerToRomanByList {
    public static void main(String[] args) {
        int num = 1993;
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40 ,10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        int size = 13;
        for (int idx = 0; idx < size; idx++) {
            while (num / nums[idx] != 0) {
                result += strs[idx];
                num -= nums[idx];
            }
        }
        return result;
    }
}
