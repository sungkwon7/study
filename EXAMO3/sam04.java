package EXAMO3;

public class sam04 {

    public static void main(String[] args) {

        // int i1 = 12 / 5; // -> 정수형이기 때문에 2.4 가 아니라 2로 나옴
        // int i2 = 12 % 5; // -> %(나머지 구하기) 정수형이기 때문에 2로 나옴



        // System.out.println(i1);
        // System.out.println(i2);

        // -----------------------------------------

        // 증가 연산자 ++i;
        // 감소 연산자 --i;
        // 전위 연산자 ++i;
        // 후위 연산자 i++;  

        int i21 = 10;
        System.out.println(i21);

        ++i21;
        System.out.println(i21);

        i21++;
        System.out.println(i21);

        // ;(세미콜론)을 만나기 전에 만나 증가 하면 전위 
        // ;(세미콜론)을 만나기 후에 만나 증가 하면 후위 

        System.out.println("-----------");

        System.out.println(++i21); // -> 전위증감 +1후 출력  = 13
        System.out.println(i21++); // -> 후위증감 출력후 +1  = 13

        System.out.println("------------");
        
        System.out.println(i21); // 후위증감 13+1 한 값 = 14출력

        // ------------------------------------------

        // 삼한연산자

        //(조건)        ?   (참)           :   (거짓);
        //(피연산자1)   ?   (피연산자2)     :   (피연산자3);       
        
        // int result = (3 > 4) ? 10 : 20;
        // int result2 = (3 < 4) ? 10 : 20;

        // System.out.println("result" + result); 
        // System.out.println("result2" + result2); 
        // 3 > 4가 틀림으로 거짓 값인 20 출력
        // 3 < 4가 맞음으로 거짓 값인 10 출력

        // ---------------------------------------------

        // 비교연산자

        int i1 = 10;
        int i2 = 10;

        
        // = (하나인 경우)-> 대입연산자 
        // == (2개인 경우) -> 비교
        // === (3개인 경우[자바에서]) -> 형태가 같냐?

        System.out.println(i1 > i2);
        System.out.println(i1 >= i2);
        System.out.println(i1 < i2);
        System.out.println(i1 <= i2);
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);


        // if (10 < i1 < 20){} // -> 'i1이 10과 20 사이에 존재 하는가'의 코딩이였음 
                               // 이렇게 하면 틀림 

        // if (10 < i1 && i1 < 20){} // &&(and)를 이용해서 풀었어야 함         
        System.out.println("-------------");
        //----------------------------------------------------

        // 논리연산자[&&(and), ||(or), ^(베타-서로 다를 때 참), !(not)]

        int j1 = 20;
        int j2 = 30;

        // <,> 애내는 비교연산자이고, &&논리연산자인데 그럼 누가 우선인가?
        // 이럴 때는 괄호를 사용하자 
        System.out.println(i1 < i2);
        System.out.println(j1 < j2);
        System.out.println((i1 < i2) && (j1 < j2) ); // and는 둘다 참 혹은 거짓 이여야함 앞에께 참이여야 하는데 거짓 이면 뒤에꺼는 실행 안한다 바로 거짓으로 출력
        System.out.println((i1 < i2) || (j1 < j2 )); // or은 두개 중 하나만 참 혹은 거짓이면 되기때문에 문제가 참이여야 한다면 앞에께 참이다 뒤에꺼는 실행 안함
                                                     // 즉 프로그래밍 할 때 순서배치를 생각 없이 하는 것이 아니라 잘 생각 해서 짜야함 
        System.out.println((i1 < i2) ^ (j1 < j2 ));
        System.out.println(!(i1 < i2));

        System.out.println("--------------------");


        int i11 = 12;
        int i22 = ~i11 +1;

        System.out.println(i11);
        System.out.println(i22);

        System.out.println("---------------------");

        int i31 = 0b0000_0000_0000_0000_0000_0000_0001_0100;
        int i32 = i31 >> 1; // 비트연산자 자릿수 한 칸씩 오른쪽으로 이동
                            // 0b0000_0000_0000_0000_0000_0000_0000_1010;
        
        int i33 = i31 >> 2; // 0b000000_0000_0000_0000_0000_0000_0001_01;뒤에 두개 살아지고 앞에 원래 값이였던 0이 두개 생김

        int i34 = i31 >> 3; // 0b0000000_0000_0000_0000_0000_0000_0001_0;

        int i35 = i31 >> 4; // 0b00000000_0000_0000_0000_0000_0000_0001;

        int i36 = i31 >> 5; // 0b000000000_0000_0000_0000_0000_0000_000;

        // >>(오른쪽)인 경우는 나누기 2를 한다는 소리 

        int i37 = i31 << 1; //0b0000_0000_0000_0000_0000_0000_0010_1000;
        
        // <<(왼쪽)인 경우는 곱하기 2를 한다는 소리

        System.out.println(i31);
        System.out.println(i32);
        System.out.println(i33);
        System.out.println(i34);
        System.out.println(i35);
        System.out.println(i36);
        System.out.println(i37);

        System.out.println("--------------------");

        // 대입연산자의 대한 축약형 -> 익숙해져야 잘 사용함

       /*  
            int a = 10;
            int b = 20;
            a += b;
            a = a b;  
        */

        // 원래있던 a와 b의 값을 다시 a에 대입 할 때 사용


        // 형변환

        double d1 = 10.0d;


        System.out.println(d1);


        for (int i = 0; i < 10; i++){ // -> 반복문 뒤에서
            d1 += 0.1;
            System.out.printf("\n%5.2f", d1); // -> 자릿수 표현

        }


        System.out.println("-----------------------");


        /* 
            short s1 = 10;
            short s2 = 20;
            short s3 = (short) (s1 + s2); 
            int s3 = s1 + s2;

            int i1 = 10;
            int i2 = 0;
            int i3 = i1 / i2;
        */






    }

}
