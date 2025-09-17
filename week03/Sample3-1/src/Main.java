//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //선언문
        //기본형들
        int a = 0;   //a를 변수(vairable)
        float b = 0.0f;   //float는 가장 간편함
        long c = 0L;
        byte d = 0;
        short f = 0;
        boolean t = false;
        char g = ' ';

        final float PI = 3.141592f;  //Symbolic Constants(기호적 상수)
        // final 앞에 쓸 경우 값을 수정할 수 없음

        String k = null;
        String y = "";
        // 2의 방법 : String z = new String( "");



        // PI = 3.14;  불가능!!

        a = 5;  //대입문    5를 정수형(Literal)  6L은 기억장소가 long형이므로 오류남
        b = 5.5f;   // 5.5f는 float 리터럴   5.5는 double literal
        c = 5;

        //데이터에 손실이 나도 내가 책임을 지겠다는 의미. 데이터에 손실이 안 나는 것은 아님.
        a = (int) 6L; //Cast 연산자
        d = (byte) 128;  //byte는 127까지만
        f = (short) 40000;  //short는 32768까지만
        a = a + 5; //왼쪽리터럴 : 기억장소 , 오른쪽리터럴 : 값 , 상수는 기억장소가 될 수 없음



    }
}