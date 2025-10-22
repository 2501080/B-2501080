import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int age, time;
        final int DEFAULT = 10000;
        int discount = 0;
        int ticket = 0;

        //data 입력
        System.out.print("당신이 관람하는 시간은(0~23 시간 단위 입력 ) ? ");
        time = keyboard.nextInt();
        System.out.print("당신의 나이는 ? ");
        age = keyboard.nextInt();

        //처리
        if (time>=6 && time<=10) {
            discount = (int) (DEFAULT * 0.2);
        } else if (age >= 8 && age <= 18) {
            discount = (int) (DEFAULT * 0.3);
        } else if (age >= 65) {
            discount = (int) (DEFAULT * 0.4);
        }

        ticket = DEFAULT - discount;

        //출력
        System.out.printf("당신이 내야하는 티켓 요금은 %,d원 입니다.\n", ticket);
    }
}