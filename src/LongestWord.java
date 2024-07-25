import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        LongestWord T = new LongestWord();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
    public String solution(String str) {
        String answer = "";
        int max = 0;
        for (String word : str.split(" ")) {
            int len = word.length();
            if (len > max) {
                answer = word;
                max = len;
            }
        }
        return answer;
    }
}
