public class StringTest {

    public static void main(String[] args) {
        String path = "DUMqP01";
        System.out.print(containsCheck(path));
    }

    public static String containsCheck(String check) {
        if (check == null) {
            return "null";
        } else if (!check.contains("DUMP")){
            return "1";
        }
        return "2";
    }
}
