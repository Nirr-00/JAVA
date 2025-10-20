import java.util.Scanner;

public class MultipeOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수 를 입력 하세요 : ");

        int number = sc.nextInt();
        if(number % 3 == 0)
        {
            System.out.println(number+"는 3의 배수 입니다.");
        }
        else
        {
            System.out.println(number+"는 3의 배수가 아닙니다.");
        }
    }
}
