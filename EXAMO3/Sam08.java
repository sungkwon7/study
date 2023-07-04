package EXAMO3;

public class Sam08 {

    public static void main(String[] args) {

        String[] str = {"홍길동", "이순신", "세종대왕"};

        for (int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }

        // foreach문
        for(String s : str) {

            System.out.println(s);
        }

    }
    
}
