import java.util.Scanner;

public class WordChain {
    public static void main(String[] args) {
        WordGameApp game = new WordGameApp();
        game.run();
    }
}

class WordGameApp
{
    private Scanner sc = new Scanner(System.in);

    void run()
    {
        System.out.println("플레이어 인원수를 적어주세요 : ");
        int PlyaerCount = sc.nextInt();
        sc.nextLine();

        String word = "아버지";

        int lastIndex = word.length() -1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = word.charAt(0);

        System.out.println("시작단어 : "+word);

        for (int i = 1; i <= PlyaerCount; i++)
        {
            System.out.println(i + "플레이어 첫 단어를 입력해주세요. : ");
            String input = sc.nextLine();

            if (input.charAt(0) == lastChar)
            {
                System.out.println("정상 입력 되었습니다.");
                lastChar = input.charAt(input.length() -1);
            }
            else
            {
                System.out.println("잘못된 단어 입니다. [게임종료]");
                break;
            }
        }
    }
}
