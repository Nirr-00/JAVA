import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        int acc = 250000;
        int room = 150000;
        Scanner sc = new Scanner(System.in);

        System.out.println("인원수는?");
        int people = sc.nextInt();

        System.out.println("숙박일은?");
        int day = sc.nextInt();

        System.out.println("여행지 >> 태국 치앙마이");
        System.out.println("인원수 >> "+people);
        System.out.println("숙박일 >> "+day);
        System.out.println("1인당 항공료 >> 250000");
        System.out.println("1인당 숙박비 >> 150000");

        if(people/2 != 0)
        {
            int people_ = people+1;
            int room_ = people_/2;
            int price = (acc*people)+(room*room_*day);

            System.out.println(people+"의 태국 치앙마이 4박 5일 여행에는 방이"+room_+"개 필요하며 경비는"+price+"원 입니다.");
        }
        else
        {
            int people_ = people;
            int room_ = people_/2;
            int price = (acc*people)+(room*room_*day);

            System.out.println(people+"의 태국 치앙마이 여행에는 방이"+room_+"개 필요하며 경비는"+price+"원 입니다.");
        }
    }
}
