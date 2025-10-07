import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int cost = 0;
        char membership = ' ';
        String information = "";

        //data 입력
        System.out.print("당신의 총 구매 금액은? ");
        cost = keyboard.nextInt();
        System.out.print("당신은 멤버십 회원인가요(O/X)? ");
        membership = keyboard.next().charAt(0);

        //처리
        information = (cost >= 50000) || (membership == 'O' && cost >= 30000) ? "가능" : "불가";

        //출력
        System.out.printf("당신은 무료배송 %s 입니다.\n", information);
    }
}