package Study1;

import java.util.Scanner;

public class study03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int price = 0;

        System.out.println("[입장권 계산]");

        System.out.print("나이를 입력 해주세요(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int time = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요(y/n)");
        int mnm = sc.next().trim().charAt(0);

        System.out.print("복지카드 여부를 입력해 주세요(y/n)");
        int welfare = sc.next().trim().charAt(0);


        if(age <3)  {
            price = 0;
        } else if (age < 13 || time >= 17) {
            price = 4000;
        } else if (mnm == 'y' || welfare == 'y') {
            price = 8000;
        } else {
            price = 10000;
        }


        System.out.print(String.format("입장료:" + price));
        sc.close();
    }
    
}
