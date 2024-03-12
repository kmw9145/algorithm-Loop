package 홀수짝수;

import java.util.Scanner;

public class 알고리즘 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            // 숫자 입력
            System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");
            number = scanner.nextInt();

            // 0을 입력하면 종료
            if (number == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 짝수 또는 홀수 판단
            if (number % 2 == 0) {
                System.out.println(number + "은(는) 짝수입니다.");
            } else {
                System.out.println(number + "은(는) 홀수입니다.");
            }

            // 계속 할 것인지 묻기
            System.out.print("계속 하시겠습니까? (1: 계속, 0: 종료): ");
            int choice = scanner.nextInt();

            // 0을 입력하면 종료
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        } while (true);

        scanner.close();
    }
}