import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int price = 0;

        //data 입력
        System.out.print("판매 금액이 얼마인가요? ");
        total = keyboard.nextInt();

        //처리
        price = (int) (total / 1.1);

        //출력
        System.out.printf("판매금액 : %,d원 \n\n", total);
        System.out.printf("금액 : %,d원 \n", price);
        System.out.printf("세금 : %,d원 \n", total-price);
    }
}