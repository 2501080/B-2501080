import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //선언문
        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        //data 입력
        System.out.print("소비된 연료량 입력 ");
        litter = keyboard.nextFloat();
        System.out.print("운행한 거리 입력 ");
        km = keyboard.nextFloat();

        //처리
        result = km/litter;

       //출력
        System.out.printf("자동차 소비된 연료  : %.1f Litter\n", litter);
        System.out.printf("자동차 운행 거리  : %.1f Km\n", km);
        System.out.printf("연비 : %2f %c\n", result, '\u339e');
    }
}