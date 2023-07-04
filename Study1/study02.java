
// 조성권
package Study1;

import java.util.Scanner;

public class study02 {
    public static void main(String[] args) {
        

        System.out.println("[캐시백 계산]");
        Scanner scanner = new Scanner(System.in);

        System.out.print("결제 금액을 입력해주세요.(금액):");
        int cash = scanner.nextInt();
        int cashBack = (int)(cash * 0.1 / 100) * 100;

        if (cashBack > 300) {
            cashBack = 300;
        }
        System.out.print("결제금액은 " + cash + "원이고," + "캐시백은 " + cashBack + "원 입니다.");


    }
}
