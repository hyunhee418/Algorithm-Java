import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MIX";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of('M', 1000, 'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1);
        int result = 0;
        int a = 0;
        for (int i= 0; i<s.length();i++) {
            if (i != s.length()-1) {
                Integer current = map.get(s.charAt(i));
                Integer next = map.get(s.charAt(i+1));
                if (next > current) {
                    result -= map.get(s.charAt(i));
                    result -= a;
                    a = 0;
                } else if (next.equals(current)) {
                    a += map.get(s.charAt(i));
                }
                else {
                    result += map.get(s.charAt(i));
                    result += a;
                    a = 0;
                }
            } else {
                result += map.get(s.charAt(i));
                result += a;
                a = 0;
            }
        }
        return result;
    }
}
