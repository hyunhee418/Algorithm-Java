import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveDuplChar {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        RemoveDuplChar T = new RemoveDuplChar();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }
}
