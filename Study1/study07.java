package Study1;

// 조성권
// 로또 당첨 프로그램

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class study07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("[로또 당첨 프로그램]" + "\n");

        System.out.print("로또 개수를 입력해 주세요,(숫자 1 ~ 10):");
        Integer num = sc.nextInt();
        List<int[]> numberList = new ArrayList<int[]>();
        int[] myNumber = new int [6];

        char a = 'A';
        for (int i = 0; i < num; i++) {
            System.out.printf("%c", a);
            myNumber = new int[6];
            myNumber = make();
            numberList.add(myNumber);
            a++;
            numPrint(myNumber);
            System.out.println();
        }

        //
        System.out.println("\n" + "[로또 발표]");
        int[] lotto = new int[6];
        lotto = make();
        numPrint(lotto);
        System.out.println();

        //
        HashMap<Character,Integer> map = new HashMap<>();
        a = 'A';
        for (int i = 0; i < num; i++) {
            int v = 0;
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (numberList.get(i)[j] == lotto[k]){
                        v++;
                    }
                }
            }
            map.put(a,v);
            a++;
        }

        //
        System.out.println("\n" + "[내 로또 결과]:");
        a = 'A';
        for (int i = 0; i < map.size(); i++) {
            System.out.print(a);
            numPrint(numberList.get(i));
            System.out.print(" => ");
            System.out.println(map.get(a) + "개 일치");
            a++;
        }
    }

    public static void numPrint(int[] Numbers){
        System.out.print("\t");
        for (int i = 0; i < Numbers.length; i++) {
            if (i != 0){
                System.out.print(",");
            }
            System.out.print(Numbers[i]);
        }
    }

    public static int[] make () {

        int[] set = new int[6];
        Random rn = new Random();
        for (int i = 0; i < 6; i++) {
            set[i] = rn.nextInt(45) +1;
        }
        return set;
    }
    
}
