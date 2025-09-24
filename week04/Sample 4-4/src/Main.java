import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int won = 0;
        float convert = 0.0f;
        float dollar = 0.0f;

        //data 입력
        System.out.print("오늘의 dollar 환율은? ");
        convert = keyboard.nextFloat();
        System.out.print("원화 얼마를 dollar로 환전할까? ");
        won = keyboard.nextInt();

        //처리
        dollar = won / convert;

        //출력
        System.out.printf("원화(₩) %,d원은 %,f 달러($) 입니다.", won, dollar);
    }
}