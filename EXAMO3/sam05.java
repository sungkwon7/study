package EXAMO3;


public class sam05 {
    public static void main(String[] args){

        int age = 20;
        char gender = 'M';
        String item = "";
        String subItem = "";
        String genderItem = ""; 
       
        System.out.println("조건시작");

        // 성인인지 확인 
        
        if (age > 19) { // 조건1

            item = "아이템1"; 
            subItem = "서브아이템1";
            // if 기본문법에서 조건(age > 19)를 검사
            // 조건이 맞으면 문자열(아이템1)을 변수(item)에 대입
                if (gender == 'F') {
                    genderItem = "여성아이템1"; 
                
                }   else {
                        
                        genderItem = "남성아이템";

                    }

        } else if (age > 14) { // 조건2

            item = "아이템2"; 
            subItem = "서브아이템2";

        } else if (age > 10) { // 조건3

            item = "아이템3"; 
            subItem = "서브아이템3";

        }
        else { // 조건에 없을 때

            item = "없음";
            subItem = "없음";

        }

            System.out.println("조건 끝");
            System.out.println("item" + item);
            System.out.println("subItem" + subItem);
            System.out.println("genderItem" + genderItem);
        
             
        
    }
}
