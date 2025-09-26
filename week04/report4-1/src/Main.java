import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        final int PRICE = 56000;
        int scale = 0;
        int housing_price = 0;

        //data 입력
        System.out.print("주택의 평수를 입력 : ");
        scale = keyboard.nextInt();

        //처리
        housing_price = scale * PRICE;
        housing_price /= 1000;
        housing_price *= 1000;

        //출력
        System.out.printf("주택지 평수 : %d\n", scale);
        System.out.printf("신도시 주택지 가격 : %,d", housing_price);
    }
}