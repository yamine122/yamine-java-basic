import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하시오");
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        a = scanner.nextInt();
        System.out.println("다음 숫자를 입력하시오");
        b = scanner.nextInt();
        System.out.println("연산종류를 선택하세요  +, -, *, /");
        String op = "";
        op = scanner.next();
        //int op = 0;
        if(op.equals( "+")){
            c = a + b;
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")){
            c = a - b;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        }else if(op.equals("*")){
            c = a * b;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        }else{
            c = a / b;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        }

        
    }
}