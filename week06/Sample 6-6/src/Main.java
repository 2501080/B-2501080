import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        final int HEART = 65;
        int life;
        long result;

        //data 입력
        System.out.print("당신은 몇 년 사셨나요? ");
        life = keyboard.nextInt();

        //처리
        result = (long) (life * (365 * 24 * 60) * HEART);    //int형으로만 계산 하므로 long형으로 받지 못 해 (long) 입력해야함

        //출력
        System.out.printf("우리의 심장은 분당 %d회 박동 합니다.\n", HEART);
        System.out.printf("%d년 동안 우리의 심장은 %,d회 박동 합니다.\n", life, result );
    }
}