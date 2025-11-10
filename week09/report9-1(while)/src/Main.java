//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        final int CHICKENLEG = 2;
        final int DOGLEG = 4;
        int chicken=0;
        int dog;

        while (chicken <= 37) {
            dog = 37 - chicken;
            if (chicken * CHICKENLEG + dog * DOGLEG == 102) {
                System.out.printf("닭 : %d 마리, 개 : %d 마리\n", chicken, dog);
                break;
            }
            chicken++;
        }
    }
}