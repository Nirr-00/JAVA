import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int random = (int)(Math.random() * 100) + 1;
            int player = 0;

            System.out.println("1~100 숫자를 맞혀보세요");

            while (true)
            {
                player = sc.nextInt();

                if (random > player)
                {
                    System.out.println("Up");
                }
                else if (random < player)
                {
                    System.out.println("Down");
                }
                else
                {
                    System.out.println("맞았습니다. 다시 하시겠습니까? (y/n)");
                    String yn = sc.next();

                    if (yn.equalsIgnoreCase("y"))
                    {
                        break;
                    }
                    else if (yn.equalsIgnoreCase("n"))
                    {
                        System.out.println("게임을 종료합니다.");
                        return;
                    }
                    else
                    {
                        System.out.println("y 또는 n만 입력해주세요.");
                    }
                }
            }
        }
    }
}
