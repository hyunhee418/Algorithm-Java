import java.util.Arrays;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] idxArray= new int[ransomNote.length()];
        for (int idx = 0; idx < magazine.length(); idx ++) {
            int ridx = ransomNote.indexOf(magazine.charAt(idx));
            if (ridx != -1) {
                idxArray[ridx] = 1;
                ransomNote = ransomNote.substring(0, ridx) + "0" + ransomNote.substring(ridx+1);
            }
        }
        if (Arrays.stream(idxArray).sum() == idxArray.length) return true;
        return false;
    }
}
