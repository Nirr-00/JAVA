import java.util.Scanner;

public class Adjustment {
    public static void main(String[] args) {
        System.out.println("1달러 = 1200원 입니다. 달러를 입력하세요");

        Scanner sc = new Scanner(System.in);

        int dollar = sc.nextInt();

        System.out.println(dollar+ " 달러는 " +dollar*1200+ " 원 입니다.");
    }
}
