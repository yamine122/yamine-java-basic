import java.util.Scanner;
class WhatName {
    public static void main(String[] args) {
         System.out.println("이름이 뭐니 ?");
         String name = " ";
         // 값을 입력하는 지점
         Scanner scanner = new Scanner(System.in);
         name = scanner.next();
         System.out.println(String.format("이름은 %s 이다", name));
         System.out.println("몇살이에요?");
         int age = 0;
         age = scanner.nextInt();
         System.out.print("나이는" + age + "이다");
    }
}