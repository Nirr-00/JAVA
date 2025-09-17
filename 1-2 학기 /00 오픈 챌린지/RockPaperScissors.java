import java.util.Scanner;

public class RockPaperScissors {
    private static int int_(String s)
    {
        switch (s)
        {
            case "가위": return 1;
            case "바위": return 2;
            case "보": return 3;
        }
        return 0;
    }

    private static int result(int a, int b)
    {
        return (3 + a -b) % 3;
    }

    public static void main(String[] args) {
        System.out.println("가위바위보 게임 입니다");
        System.out.println("가위, 바위, 보 중에서 입력 하세요");

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int a_ = int_(a);
        System.out.print("철수 >> "+a);


        String b = sc.next();
        int b_ = int_(b);
        System.out.print("영희 >> "+b);

        if(a_ == 0 || b_ == 0)
        {
            System.out.println("오류");
        }

        int r = result(a_,b_);

        if(r==0)
        {
            System.out.println("비겼습니다");
        }
        else if(r == 1)
        {
            System.out.println("철수 승");
        }
        else
        {
            System.out.println("영희 승");
        }

    }
}
