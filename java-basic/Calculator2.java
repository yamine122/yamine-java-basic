import java.util.Scanner;
class Calculator2{
    public static void main(String[] args) {
        System.out.println("숫자를 입력하시오");
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("다음 숫자를 입력하시오");
        int b = 0;
        b = scanner.nextInt();
        System.out.println(a - b);
    }
}