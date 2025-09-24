import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        double ctemperature = 0.0;
        double ftemperature = 0.0;

        //data 입력
        System.out.print("현재 섭씨 온도 (℃) : ");
        ctemperature = keyboard.nextDouble();
        //처리
        ftemperature = ((ctemperature * 9) / 5) +32;

        //출력
        System.out.printf("화씨 온도(℉) : %.2f", ftemperature);
    }
}