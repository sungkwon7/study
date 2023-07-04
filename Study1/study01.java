
/* 조성권 */ 

package Study1;

public class study01 {
    public static void main(String[] args) {

        System.out.println("[구구단 출력]");


        for(int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++) {

                System.out.printf(String.format("%02d", i) + "X" + String.format("%02d", j) + "=" + String.format("%02d",i*j));
                System.out.print("  ");

            }
            System.out.println();
        }




    }
}
    

