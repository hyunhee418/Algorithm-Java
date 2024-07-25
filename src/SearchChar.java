import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        SearchChar T = new SearchChar();
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
    public int solution(String str, char t) {
        int answer = 0;
        String upperStr = str.toUpperCase();
        char upperT = Character.toUpperCase(t);
        for (int i = 0; i<upperStr.length();i++) {
            if (upperStr.charAt(i) == upperT) {
                answer++;
            }
        }
        return answer;
    }
}
