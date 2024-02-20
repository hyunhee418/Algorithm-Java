public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "ABCDEF";
        int numRows = 5;
        System.out.println(convert(s, numRows));
    }
    public static  String convert(String s, int numRows) {
        int jump = numRows * 2 - 2;
        int len = s.length();
        int[] intArray = new int[len];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        if (numRows == 1) return s;
        while (sb.length() != len) {
            int row = 0;
            while (row * jump + idx < len) {
                if (idx != 0) {
                    if (intArray[row * jump + idx] == 0) {
                        sb.append(s.charAt(row * jump + idx));
                        intArray[row * jump + idx] = 1;
                    }
                    if ((row+1) * jump - idx >= len) break;
                    if (intArray[(row + 1) * jump - idx] == 0) {
                        sb.append(s.charAt((row + 1) * jump - idx));
                        intArray[(row + 1) * jump - idx] = 1;
                    }
                } else {
                    if (intArray[row * jump + idx] == 0) {
                        sb.append(s.charAt(row * jump + idx));
                        intArray[row * jump + idx] = 1;
                    }
                }
                row ++;
            }
            idx++;
        }
        return sb.toString();
    }
}
