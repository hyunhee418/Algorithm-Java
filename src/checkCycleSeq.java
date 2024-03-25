public class checkCycleSeq {

    public static void main(String[] args) {
        System.out.println(getCycleSeq());
    }

    private static Long seq = 1L;
    private static Long cycleSeq;
    public static String getCycleSeq(){
        if (seq == null) cycleSeq = 0L;
        cycleSeq = seq % 59999;
        cycleSeq += 900001;
        return String.format("%08d", cycleSeq);
    }
}
