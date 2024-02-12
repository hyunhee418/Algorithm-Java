import java.util.Arrays;
import java.util.Objects;

public class ValidAnagram2 {
    public static void main(String[] args) {
        String pattern = "anagram";
        String s = "nagaram";
        System.out.println(isAnagram(pattern, s));
    }
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
}
