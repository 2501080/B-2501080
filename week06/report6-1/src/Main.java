import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        final int PRICE = 4800;
        int count;
        int discount;
        int result;

        //data 입력
        System.out.print("구매한 식권의 개수는? ");
        count = keyboard.nextInt();

        //처리
        discount = (count >= 10 && count < 20) ? (int) (PRICE * count * 0.1) :
                ((count >=20 && count < 30) ? (int) (PRICE * count * 0.15) :
                        ((count >= 30) ? (int) (PRICE * count * 0.2) : 0));
        result = PRICE * count - discount;

        //출력
        System.out.printf("식권 한 장당 %,d원 입니다.\n", PRICE);
        System.out.printf("당신이 구매한 식권 개수는 %d개 입니다.\n",count);
        System.out.printf("할인율은 총 %,d원이고, 총 구매 금액은 %d입니다.\n", discount, result);
    }
}