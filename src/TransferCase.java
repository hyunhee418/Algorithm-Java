import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransferCase {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        TransferCase T = new TransferCase();
        String str = kb.next();
        System.out.print(T.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            answer += Character.isLowerCase(x)? Character.toUpperCase(x) : Character.toLowerCase(x);
        }
        return answer;
    }
}
