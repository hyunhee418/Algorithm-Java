import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Masking {

    public static void main(String[] args) {
        System.out.print(masking("1000푸1000"));
        System.out.print(String.format("%02d푸%04d", 12003002 % 100, 1000));
    }
    public static final List<String> CAR_NO_REGEX = Arrays.asList(
            "^\\d{2,3}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하|국|합|육|해|공|처|커|터|퍼|초|코|토|포|추|쿠|투|푸|후|그|느|드|르|므|브|스|으|즈|츠|크|트|프|흐|차|카|타|파]\\d{4}$",
            "^[서울|부산|대구|인천|대전|광주|울산|제주|경기|강원|충남|전남|전북|경남|경북|세종]{2}\\d{1,2}[가|나|다|라|마|거|너|더|러|머|버|서|어|저|고|노|도|로|모|보|소|오|조|구|누|두|루|무|부|수|우|주|바|사|아|자|허|배|호|하|처|커|터|퍼|초|코|토|포|추|쿠|투|푸|후|그|느|드|르|므|브|스|으|즈|츠|크|트|프|흐|차|카|타|파]\\d{4}$",
            "^[외교|영사|준외|준영|국기|대표|협정]{2}\\d{3}-\\d{3}$");

    public static String masking(String carNo) {
        String result = carNo;
        for (int i = 0; i < CAR_NO_REGEX.size(); i++) {
            final String each = CAR_NO_REGEX.get(i);
            final Pattern pattern = Pattern.compile(each);
            final Matcher matchedCarNo = pattern.matcher(carNo);
            result = result.replaceAll("[^0-9]", "");
            if (matchedCarNo.matches()) {
                if (i == 0 || i == 1) {
                    //01가1234, 서울01가1234 경우, 뒤에 4자리 추출
                    result = result.substring(result.length() - 4, result.length());
                }
                break;
            }
        }
        return result;
    }
}
