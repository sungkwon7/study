package Study1;

import java.util.Random;


public class study06 {
    static final int totalVote = 10000;
    public static void main(String[] args) {
 
        Random random = new Random();
        int[] presidential = new int[5];
        String[] nominee = new String[]{"이순신", "이황", "이도", "심사임당", "홍길동"};

        for (int i = 1; i <= totalVote; i++) {
            int voteRate = (random.nextInt(5) + 1) % 5;
            presidential[voteRate]++;

            System.out.println();
            System.out.printf("[투표진행율]: %05.02f%c, %d명 투표 => %s\n", ((double) presidential[voteRate] / (double) totalVote) * 100.0f, '%', (int) presidential[voteRate], nominee[voteRate]);
            System.out.printf("[기호:1] 이순신: %05.02f%c, (투표수: %d)\n", ((double) presidential[0] / (double) totalVote) * 100.0f, '%', presidential[0]);
            System.out.printf("[기호:2] 이황: %05.02f%c, (투표수: %d)\n", ((double) presidential[1] / (double) totalVote) * 100.0f, '%', presidential[1]);
            System.out.printf("[기호:3] 이도: %05.02f%c, (투표수: %d)\n", ((double) presidential[2] / (double) totalVote) * 100.0f, '%', presidential[2]);
            System.out.printf("[기호:4] 심사임당: %05.02f%c, (투표수: %d)\n", ((double) presidential[3] / (double) totalVote) * 100.0f, '%', presidential[3]);
            System.out.printf("[기호:4] 홍길동: %05.02f%c, (투표수: %d)\n", ((double) presidential[4] / (double) totalVote) * 100.0f, '%', presidential[4]);

            if (i == totalVote) {
                int m = 0;
                for (int j = 0; j < 5; j++) {
                    if (m < presidential[j]) {
                        m = presidential[j];
                    }
                }
                int same = 0;
                for (int j = 0; j < 5; j++) {
                    if (m == presidential[j]) {
                        same++;
                    }
                }

                if (same > 1) {
                    i--;
                }
            }
        }

        int max = 0;
        String election = new String();
        for (int i = 0; i < 5; i++) {
            if (max < presidential[i]) {
                max = presidential[i];
                election = nominee[i];
            }
        }

        System.out.printf("[투표결과] 당선인: %s\n", election);


    }
    
}
