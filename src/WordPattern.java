import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat file";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] strArray = s.split(" ");
        int pLen = pattern.length();
        if (pLen != strArray.length) return false;
        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<String, Integer> sMap = new HashMap<>();
        for (Integer idx = 0; idx < pLen; idx++) {
            if (pMap.put(pattern.charAt(idx), idx) != sMap.put(strArray[idx], idx)) return false;
        }
        return true;
    }
}
