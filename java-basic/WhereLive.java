import java.util.Scanner;
class WhereLive {
    public static void main(String[] args) {
        System.out.println("어디에 사세요?");
        String place = " ";
        Scanner scanner = new Scanner(System.in);
        place = scanner.next();
        System.out.println(String.format("사는곳은 %s 이다", place));

    }
}