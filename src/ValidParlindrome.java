import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidParlindrome {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        ValidParlindrome T = new ValidParlindrome();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-1-i)) return "NO";
        }
        return "YES";
    }
}
