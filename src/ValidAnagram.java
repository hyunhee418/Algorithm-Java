public class ValidAnagram {
    public static void main(String[] args) {
        String pattern = "anagram";
        String s = "nagaram";
        System.out.println(isAnagram(pattern, s));
    }
    public static boolean isAnagram(String s, String t) {
        int sLen = s.length();
        if (sLen != t.length()) return false;
        for (Integer idx = 0; idx < sLen; idx ++) {
            int tidx = t.indexOf(s.charAt(idx));
            if (tidx == -1) return false;
            t = t.substring(0, tidx) + "0" + t.substring(tidx+1, sLen);
        }
        return true;
    }
}
