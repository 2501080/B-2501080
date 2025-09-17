//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        String name = "홍길동";
        int age = 21;
        double sight = 1.2f;
        String type = "O";

        System.out.printf("이름 : %2s\n", name);   //'10s'는 10자리 써주시고 그다음 입력한 문자 출력해주세요.
        System.out.printf("나이 : %d\n", age);
        System.out.printf("시력 : %3.1f\n", sight);
        System.out.printf("혈액형 : %s\n", type);
    }
}