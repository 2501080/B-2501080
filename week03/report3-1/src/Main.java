import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        //data 입력
        System.out.print("첫번째 숫자를 입력하세요 ");
        num1 = keyboard.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ");
        num2 = keyboard.nextInt();

        //처리
        result = num1 + num2;

        //출력
        System.out.printf("%d + %d = %d", num1, num2, result);
    }
}