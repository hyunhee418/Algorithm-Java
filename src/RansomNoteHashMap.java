import java.util.HashMap;
import java.util.Map;

public class RansomNoteHashMap {
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineDict = new HashMap<>();
        for (int i=0; i<magazine.length();i++) {
            char mag = magazine.charAt(i);
            if (!magazineDict.containsKey(mag)) {
                magazineDict.put(mag, 1);
            } else {
                magazineDict.put(mag, magazineDict.get(mag)+1);
            }
        }
        for (int ri = 0; ri<ransomNote.length();ri++) {
            char note = ransomNote.charAt(ri);
            if (magazineDict.containsKey(note)) {
                if (magazineDict.get(note) == 0) {
                    return false;
                } else {
                    magazineDict.put(note, magazineDict.get(note)-1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
