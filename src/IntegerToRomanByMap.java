import java.util.*;

import static java.util.Map.entry;

public class IntegerToRomanByMap {
    public static void main(String[] args) {
        int num = 1993;
        System.out.println(intToRoman(num));
    }
    public static String intToRoman(int num) {
        Map<Integer, String> map = Map.ofEntries(
                entry(1, "I"), entry(4, "IV"), entry(5, "V"), entry(9, "IX"), entry(10, "X"), entry(40, "XL"), entry(50, "L"),
                entry(90, "XC"), entry(100, "C"), entry(400, "CD"), entry(500, "D"), entry(900, "CM"), entry(1000, "M"));
        List<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        String result = "";
        int size = keyList.size();
        for (int idx = 0; idx < size; idx++) {
            while (num / keyList.get(size-1-idx) != 0) {
                result += map.get(keyList.get(size-1-idx));
                num -= keyList.get(size-1-idx);
            }
        }
        return result;
    }
}
