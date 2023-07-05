package Study1;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class study4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        study4 main = new study4();
        HashMap<String, String> gu = new HashMap<>();

        Random random = new Random();

        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        gu.put("year", scanner.next());

        System.out.print("출생월을 입력해 주세요. (mm):");
        gu.put("month", scanner.next());

        System.out.print("출생일을 입력해 주세요. (dd)");
        gu.put("day", scanner.next());

        System.out.print("성별을 입력해 주세요. (m/f)");
        gu.put("gender", scanner.next());

        main.finalNumber(gu);
    }



    /** 주민번호 앞자리 생성 */
    public String firstNumber(HashMap gu) {
        return gu.get("year").toString().substring(2) + gu.get("month") + gu.get("day");
    }



    /** 주민번호 뒷자리 생성  */
    public String SecondNumber(HashMap gu) {
        StringBuffer result = new StringBuffer();
        Random random = new Random();

        int year = Integer.valueOf((String) gu.get("year"));

        if(year < 1900) {
            result.append( "m".equals(gu.get("gender")) ? "9" : "0" );
        } else if (year < 2000) {
            result.append( "m".equals(gu.get("gender")) ? "1" : "2" );
        } else {
            result.append( "m".equals(gu.get("gender")) ? "3" : "4" );
        }

        for(int i = 0 ; i < 6 ; i++) {
            result.append(random.nextInt(10) );
        }

        return result.toString();
    }




    /** 주민번호 생성 */
    public void finalNumber(HashMap gu) {
        System.out.println(firstNumber(gu) + "-" + SecondNumber(gu));
    }
}
