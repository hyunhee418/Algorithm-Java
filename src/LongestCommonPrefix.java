public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        String firstStr = strs[0];
        int charIdx = 0;
        while (charIdx < firstStr.length() ){
            boolean isPrefix = true;
            for (int strIdx = 1; strIdx < strs.length ; strIdx++) {
                if (charIdx >= strs[strIdx].length() || strs[strIdx].charAt(charIdx) != firstStr.charAt(charIdx)) {
                    isPrefix = false;
                    break;
                }
            }
            if (!isPrefix) break;
            result = result + firstStr.charAt(charIdx);
            charIdx ++;
        }
        return result;
    }
}
