public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int result = 0;
        int i = 0;
        while (i < len) {
            int j = 0;
            String candi = "";
            while (i+j < len && candi.indexOf(s.charAt(i+j)) == -1) {
                candi += s.charAt(i+j);
                j++;
            }
            if (j > result) result = j;
            i++;
        }
        return result;
    }
}
