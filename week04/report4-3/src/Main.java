import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int dollar = 0;
        int half = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        int total = 0;

        //data 입력
        System.out.print("dollar의 개수는? ");
        dollar = keyboard.nextInt();
        System.out.print("half의 개수는? ");
        half = keyboard.nextInt();
        System.out.print("quarter의 개수는? ");
        quarter = keyboard.nextInt();
        System.out.print("dime의 개수는? ");
        dime = keyboard.nextInt();
        System.out.print("nickel의 개수는? ");
        nickel = keyboard.nextInt();
        System.out.print("penny의 개수는? ");
        penny = keyboard.nextInt();


        //처리
        total = (dollar * 100) + (half * 50) + (quarter * 25)
                + (dime * 10) + (nickel * 5) + penny;

        //출력
        System.out.printf("총 금액은 %d 입니다.\n", total);
    }
}