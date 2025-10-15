//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int YEAR = 365;       //상수값 : 1년
        final int SPEED = 300000;   //빛이 1초에 가는 거리 (Km)
        int second;
        long result;    //int로 하니까 -값으로 나옴

        second = YEAR * 24 * 60 * 60;
        result = (long) second * SPEED;     //객체가 long인데 여기는 계산이 int로 해서 오류


        System.out.printf("빛은 1초에 %,d Km를 이동합니다.\n",SPEED);
        System.out.printf("%d일은 %,d초 입니다.\n", YEAR, second);
        System.out.printf("빛이 %d일 동안 이동한 거리는 %,d Km 입니다.\n", YEAR, result);
    }
}