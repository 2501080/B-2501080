import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        final int COIN = 1663;
        float liter;
        int price;
        char sign;
        int discount;
        int result;

        //data 입력
        System.out.print("주유할 리터 수는? ");
        liter = keyboard.nextInt();

        //처리
        price = (int) liter * COIN;
        discount = (int) (price * 0.07);
        result = (price >= 50000) ? (int) ((price-discount) * 1.1) : (int) (price * 1.1);


        //출력
        System.out.printf("리터당 주유 값은 %,d이므로\n", COIN);
        System.out.printf("당신이 원래 내야할 금액은 %,d원이므로 '7%% 할인 적용 %c'\n", price, sign = (price >= 50000) ? 'O' : 'X' );
        System.out.printf("총 내야하는 금액은 %,d원 입니다.", result);
    }
}