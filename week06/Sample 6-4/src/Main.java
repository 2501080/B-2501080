import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int degree;
        float result;

        //data 입력
        System.out.print("섭씨온도 입력 : ");
        degree = keyboard.nextInt();

        //처리
        result = degree * (9.0f / 5) + 32;    //(float) 넣을 필요 없이 9 대신 9.0f로 입력

        //출력
        System.out.printf("섭씨온도 %d\u2103는 화씨온도 %.1f\u2109 입니다.\n", degree, result);
    }
}