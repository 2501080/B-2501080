import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        float temperature;
        String weather = "";

        //data 입력
        System.out.print("현재 온도 입력(℃) : ");
        temperature = keyboard.nextInt();

        //처리
        if (temperature >= 35) {
            weather = "폭염 경보";
        } else if (temperature >= 30) {
            weather = "폭염 주의보";
        } else if (temperature >= -10) {
            weather = "정상 온도";
        } else {
            weather = "한파 경보";
        }

        //출력
        System.out.printf("현재 날씨는 %s 입니다.\n", weather);
    }
}