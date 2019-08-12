import java.util.Scanner;
import java.util.Random;

class Dice{
    public static void main(String[] args){
        Scanner  scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
         String dap ="";
        if(dice == 1){
            dap="홀";
        }else if(dice == 2){
            dap="짝";
        }else if(dice == 3){
            dap="홀";
        }else if(dice == 4){
            dap="짝";
        }else if(dice == 5){
            dap="홀";
        }else{
            dap="짝";
        }
            System.out.println("주사위 값을 예측한 홀, 짝 입력");
            String answer = "";
            answer = scan.next();
            if(answer.equals(dap)){
                System.out.println("정답입니다");
            }else if(!answer.equals(dap)){
                System.out.println("오답입니다");
            }else{
                System.out.println("잘못입력하셨습니다");
            }           
        }        
    }

