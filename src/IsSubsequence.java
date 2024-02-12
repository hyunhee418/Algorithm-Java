public class IsSubsequence {
    public static void main(String[] args) {
        String s= "ab";
        String t = "baab";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int idxValue = 0;
        for (int idx=0; idx<s.length(); idx++){
            int tIndex = t.indexOf(s.charAt(idx));
            if (tIndex < idxValue) {
                while (tIndex != -1) {
                    if (tIndex >= idxValue) break;
                    t = t.substring(0, tIndex) + "0"+ t.substring(tIndex+1);
                    tIndex = t.indexOf(s.charAt(idx));
                }
                if (tIndex < idxValue) return false;
            }
            idxValue = tIndex;
            t = t.substring(0, tIndex) + "0"+ t.substring(tIndex+1);
        }
        return true;
    }
}
