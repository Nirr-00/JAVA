import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        System.out.println("생년월일 8자리를 입력해 주세요");

        Scanner sc = new Scanner(System.in);

        int birthday = sc.nextInt();

        int year = birthday/10000;
        int month = (birthday/100) % 100;
        int day = birthday % 100;

        System.out.println(year+ "년 " +month+ "월 " +day+ "일");

    }
}
