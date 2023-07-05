/*
 *  조성권
 *  미니과제 : 달력출력 프로그램
 */


package Study1;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Scanner;

public class study05 {

    public static void Week() {
        
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> day = new HashMap<String, Integer>();

        day.put("SUNDAY", 0);
        day.put("MONDAY", 1);
        day.put("TUESDAY", 2);
        day.put("WEDNESDAY", 3);
        day.put("THURSDAY", 4);
        day.put("FRIDAY", 5);
        day.put("SATURDAY", 6);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = scanner.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = scanner.nextInt();

        /* 칸 띄우기 */
        System.out.println();
        System.out.println();

        LocalDate date = LocalDate.of(year, month, 1);

        int firstWeek = day.get(date.getDayOfWeek().toString());
        int lastDay = YearMonth.from(date).lengthOfMonth();

        System.out.printf("[%d년 %d월]\n", year, month);
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        int cursor = 0;
        while (cursor < firstWeek) {
            System.out.print("\t");
            cursor++;
        }

        for(int i = 1 ; i <= lastDay ; i++, cursor++) {
           if( cursor > 0 && cursor % 7 == 0) System.out.println();
           System.out.printf("%s\t", String.format("%02d", i));
        }

    }

    
}
