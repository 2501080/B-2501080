import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int hour = 0;
        int minute = 0;
        int second = 0;

        //data 입력
        System.out.print("환산할 초를 입력(단위:초) : ");
        total = keyboard.nextInt();

        //처리
        hour = total / 3600;
        minute = ((total % 3600) / 60);
        second = ((total % 3600) % 60);


        //출력
        System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", total, hour, minute, second);
    }
}