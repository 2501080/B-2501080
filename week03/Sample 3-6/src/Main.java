//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        //준비물
        int work = 12000;
        int time = 5;
        int day = 7;
        int money = 25000;

        //처리
        money = money + ((work * time) * day) ;

        //출력
        System.out.printf("나의 시급 : %c %d\n", '\uffe6', work);
        System.out.printf("하루에 일한 시간 : %d 시간\n",time);
        System.out.printf("며칠 일했나요? : %d 일\n",day);
        System.out.printf("나의 지갑에 돈 : %c %d\n", '\uffe6', money);
    }
}