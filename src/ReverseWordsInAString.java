import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int idx= array.length-1; idx>=0; idx--) {
            if (!array[idx].isBlank()) reversedString.append(array[idx] + " ");
        }
        return reversedString.toString().trim();
    }
}
