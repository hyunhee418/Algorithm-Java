public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String s= "ab";
        String t = "baab";
        System.out.println(String.valueOf(strStr(t, s)));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
