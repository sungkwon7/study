package EXAMO3;

import java.util.Scanner;

public class Samo7 {
    

    public static void main(String[] args) {
        
        // 반복문 - for문

        // 예제 -  구구단 만들기

        // Scanner scanner = new Scanner(System.in);
            // int dan = scanner.nextInt();
        
             // 초기화; 조건;       증가감소
       
         /* 
            for (int i = 1; i <= 9; i++){

    
            // 반복해서 수행하는 문장
            System.out.println(dan + " X " + i + " = " + (dan * i));
            
            }
        */

        /*  // for문 0부터 시작일 때    
            for (int i = 0; i < 9; i++){

    
            System.out.println(dan + " X " + (i + 1) + " = " + (dan * (i + 1)));
            
            }
        */


        /* // while문 
            int i= 0;
            while (i++ < 9) {

            System.out.println(dan + " X " + i + " = " + (dan * i));
        

            }
        */
         
        // do while문

        /* 
            int i = 11;
            do {
                System.out.println(dan + " X " + i + " = " + (dan + i));

            } while (i <= 9 ); 
        */

        // continue문, breke문

            int dan = 6;
            
            for (int i = 1; i <= 9; i++) {

                if (i == 4) {
                    break;
                }

                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        

        
    }
    
}
