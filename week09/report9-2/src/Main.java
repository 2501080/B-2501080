//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int FIVECOIN = 500;
        final int ONECOIN = 100;
        int month;
        int total = 0;

        for (month = 1; month <= 360; month++) {
            total += FIVECOIN * 10 + ONECOIN * 10;
        }

        System.out.printf("총 저금액: %,d원\n", total);
    }
}