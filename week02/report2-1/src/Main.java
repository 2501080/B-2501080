import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        float weight = 0.0f;
        float height = 0.0f;

        //data 입력
        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요.\n");
        age = keyboard.nextInt();
        weight = keyboard.nextFloat();
        height = keyboard.nextFloat();

        //처리


        //출력
        System.out.printf("당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("당신의 체충은 %.1f kg입니다.\n", weight);
        System.out.printf("당신의 신장은 %.1f cm입니다.\n", height);
    }
}