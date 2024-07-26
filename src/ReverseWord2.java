import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ReverseWord2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        ReverseWord2 T = new ReverseWord2();
        int n = Integer.parseInt(kb.next());
        String[] input = new String[n];
        for (int k=0; k < n; k++) {
            input[k] = kb.next();
        }
        for (String r : T.solution(input)) System.out.println(r);
    }
    public List<String> solution(String[] input) {
        List<String> answer = new ArrayList<>();
        for (String ele:input) {
            int li = 0;
            int ri = ele.length()-1;
            char[] eleArray = ele.toCharArray();

            while (li < ri) {
                eleArray[ri] = ele.charAt(li);
                eleArray[li] = ele.charAt(ri);
                li++;
                ri--;
            }
            answer.add(new String(eleArray));
        }
        return answer;
    }
}
