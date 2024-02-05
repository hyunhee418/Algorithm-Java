import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s= "add";
        String t = "egg";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (Integer cidx = 0; cidx < s.length(); cidx++) {
            char sChar = s.charAt(cidx);
            char tChar = t.charAt(cidx);
            if (smap.put(sChar, cidx) != tmap.put(tChar, cidx)) return false;
        }
        return true;
    }
}
