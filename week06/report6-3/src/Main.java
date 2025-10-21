import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int age;
        char card;
        int time;
        int result1;
        int result2;

        //data 입력
        System.out.print("당신의 나이는? ");
        age = keyboard.nextInt();
        System.out.print("당신은 교통 카드를 가지고 있나요? (O/X) ");
        card = keyboard.next().charAt(0);
        System.out.println("당신이 대중교통을 탑승한 시각은? (예: 오전 12시 -> 0 / 오후 10시 -> 22) ");
        time = keyboard.nextInt();

        //처리
        result1 = (age>=0 && age<=12) ? 450 :
                (age>=13 && age<=19) && (card=='O') ? 750 :
                        (age>=13 && age<=19) && (card=='X') ? 850 :
                                (age>=20) && (card=='O') ? 1250 : 1350;
        result2 = (time>=0 && time<=4 || time>=22 && time<=23) ? (int) (result1*1.2) : result1;

        //출력
        System.out.printf("당신이 내야할 대중교통 요금은 총 %,d원 입니다. \n", result2);
    }
}