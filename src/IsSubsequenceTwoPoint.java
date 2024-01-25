public class IsSubsequenceTwoPoint {
    public static void main(String[] args) {
        String s= "ab";
        String t = "baab";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int sidx = 0;
        int tidx = 0;

        while (sidx < sArray.length && tidx < tArray.length) {
            if (sArray[sidx] == tArray[tidx]) {
                sidx++;
            }
            tidx++;
        }
        if (sidx == sArray.length) return true;
        return false;
    }
}
