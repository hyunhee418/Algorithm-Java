import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransferCase2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        TransferCase2 T = new TransferCase2();
        String str = kb.next();
        System.out.print(T.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            answer += x >= 65 && x <= 90 ? (char) (x + 32) : (char) (x - 32);
        }
        return answer;
    }
}
