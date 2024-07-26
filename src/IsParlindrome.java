import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IsParlindrome {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        IsParlindrome T = new IsParlindrome();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        int len = str.length();
        str = str.toLowerCase();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return "YES";
    }
}
