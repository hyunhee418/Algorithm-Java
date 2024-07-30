import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OnlyInteger {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner kb = new Scanner(System.in);
        OnlyInteger T = new OnlyInteger();
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }

    public Integer solution(String str) {
        str = str.replaceAll("[^0-9]", "").toUpperCase();
        return Integer.valueOf(str);
    }

}
