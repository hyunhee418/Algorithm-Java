import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        ReverseWord T = new ReverseWord();
        int n = Integer.parseInt(kb.next());
        String[] input = new String[n];
        for (int k=0; k < n; k++) {
            input[k] = kb.next();
        }
        for (String r : T.solution(input)) System.out.println(r);
    }
    public String[] solution(String[] input) {
        int len = input.length;
        String[] answer = new String[len];
        for (int i=0; i<len; i++) {
            StringBuilder ele = new StringBuilder();
            for (char x : input[i].toCharArray()) ele.insert(0, x);
            answer[i] = ele.toString();
        }
        return answer;
    }
}
