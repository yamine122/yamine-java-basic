import java.util.Random;
import java.util.Scanner;

/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
class RockPaperScissors2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int num = 0;
        num = ran.nextInt(3)+1;
        String a = "";
        String b = "";
        if(num == 1){
           a = "가위";
        }else if(num == 2){
           a = "바위";
        }else{
           a= "보";
        }
        System.out.println("가위바위보중에 하나를 고르시오");
        b = scan.next();
        System.out.println();
        if(a.equals("가위")){
            if(b.equals("가위")){
                System.out.println("비겼습니다");
            }else if(b.equals("바위")){
                System.out.println("이겼습니다");
            }else if(b.equals("보")){
                System.out.println("졌습니다");
            }
            }else if(a.equals("바위")){
                if(b.equals("가위")){
                    System.out.println("졌습니다");
                }else if(b.equals("바위")){
                    System.out.println("비겼습니다.");
                }else if(b.equals("보")){
                    System.out.println("이겼습니다");
                }
            }else if(a.equals("보")){
                if(b.equals("가위")){
                    System.out.println("이겼습니다");
                }else if(b.equals("바위")){
                    System.out.println("졌습니다");
                }else if(b.equals("보")){
                    System.out.println("비겼습니다");
                }
            }else{
                System.out.println("잘못입력하셨습니다.");
            }
    }
}
