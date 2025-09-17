//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        short test1 = 127;
        short test2 = 45;

        short result = (short) (test1 + test2);
        //(short)를 안 넣으면 계산 안 됨. * 이유:(test1 + test2) int 계산 결과를 (short)으로 변경
        result = (3 + 3.5);
        //double로 만들기 위해 3을 3.0으로 변경 후 (double) 입력 시 계산 결과 6으로 출력됨

        System.out.printf(" %d + %d = %d\n" , test1, test2, result);
    }
}