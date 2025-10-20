import java.util.Scanner;

public class SuccessOrfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("점수를 입력하십시오 : ");
        int score = sc.nextInt();
        if (score >= 80)
        {
            System.out.println("축하합니다 합격입니다.");
        }
        else
        {
            System.out.println("불합격 입니다.");
        }
    }
}