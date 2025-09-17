import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        int D = 2000;
        int K = 1000;
        int J = 3000;

        Scanner sc = new Scanner(System.in);

        System.out.println("자바 분식 입니다. 주문하면 금액을 알려드립니다");

        System.out.println("떡볶이 몇 인분");
        int Dd = sc.nextInt();

        System.out.println("김말이 몇 인분");
        int Kk = sc.nextInt();

        System.out.println("쫄면 몇 인분");
        int Jj = sc.nextInt();

        int price = (D*Dd)+(K*Kk)+(J*Jj);

        System.out.println("전체 금액은 "+price+ "원 입니다");
    }
}
