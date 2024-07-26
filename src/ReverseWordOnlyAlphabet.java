import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReverseWordOnlyAlphabet {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        ReverseWordOnlyAlphabet T = new ReverseWordOnlyAlphabet();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public String solution(String str) {
        int li = 0;
        int ri = str.length()-1;
        char[] answerArray = str.toCharArray();
        while (li <= ri) {
            while((str.charAt(li) < 65) || (str.charAt(li) > 122) || (str.charAt(li) >= 91 && str.charAt(li) < 97)) {
                li++;
            }
            while((str.charAt(ri) < 65) || (str.charAt(ri) > 122) || (str.charAt(ri) >= 91 && str.charAt(ri) < 97)) {
                ri--;
            }
            if (li >= ri) return new String(answerArray);
            answerArray[li] = str.charAt(ri);
            answerArray[ri] = str.charAt(li);
            li++;
            ri--;
        }
        return new String(answerArray);
    }
}
