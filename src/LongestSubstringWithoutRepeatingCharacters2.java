import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        char ch[] = s.toCharArray();
        int res=0;
        for(int i =0;i<ch.length;i++){
            int j = 0;
            while (i+j < s.length() && !set.contains(ch[i+j])){
                set.add(ch[i+j]);
                j++;
            }
            res = Math.max(res, j);
            set.clear();
        }
        return res;
    }
}
