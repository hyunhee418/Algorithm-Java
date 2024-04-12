import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

public class isBlankString {

    public static void main(String[] args) {
        System.out.println(getAndSet(null));
    }
    public static boolean isBlank(CharSequence cs) {
        int strLen = length(cs);
        if (strLen == 0) {
            return true;
        } else {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

    public static int length(CharSequence cs) {
        return cs == null ? 0 : cs.length();
    }

    public static String getAndSet(String s) {
        return new AtomicReference<>(s).getAndSet("");
    }
}
