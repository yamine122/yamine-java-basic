import java.util.Scanner;
class WhereLive {
    public static void main(String[] args) {
        System.out.println("��� �缼��?");
        String place = " ";
        Scanner scanner = new Scanner(System.in);
        place = scanner.next();
        System.out.println(String.format("��°��� %s �̴�", place));

    }
}