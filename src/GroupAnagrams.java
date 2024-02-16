import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> stringMap = new HashMap<>();
        for (int idx = 0; idx < strs.length; idx++){
            String str = strs[idx];
            char[] strArray = str.toCharArray();
            Arrays.sort(strArray);
            String sorted = new String(strArray);
            List<String> value = stringMap.get(sorted);
            if (value != null) {
                value.add(str);
                stringMap.put(sorted, value);
            } else {
                stringMap.put(sorted, new ArrayList<>(Arrays.asList(str)));
            }
        }
        return new ArrayList<>(stringMap.values());
    }
}
