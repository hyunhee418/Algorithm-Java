public class HappyNumber {
    public static void main(String[] args) {
        int num = 1111111;
        System.out.println(isHappy(num));
    }
    public static boolean isHappy(int n) {
        int len = (int) Math.log10(n);
        while (n > 9) {
            int result = 0;
            for (int idx = len; idx >= 0; idx--) {
                int tidx = (int) Math.pow(10, idx);
                int nidx = (int) (n / tidx);
                result += Math.pow(nidx, 2);
                n = n % tidx;
            }
            if (result == 1) return true;
            n = result;
            len = (int) Math.log10(n);
        }
        if (n == 1 || n == 7) return true;
        return false;
    }
}
