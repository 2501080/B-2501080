//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        final String SCHOOL = "경복대학교";
        final String  NAME = "홍 길동";
        final Integer AGE = 20;
        final char GENDER = '남';
        final double HEIGHT = 170.6;
        final float WEIGHT = 65.4f;
        //data 입력

        //처리

        //출력
        System.out.println("*********************");
        System.out.println("    학교 : " + SCHOOL);
        System.out.println("    이름 : " + NAME);
        System.out.println("    나이 : " + AGE);
        System.out.println("    성별 : " + GENDER);
        System.out.println("    신장 : " + HEIGHT + "Cm");
        System.out.println("    체중 : " + WEIGHT + "Kg");
        System.out.println("*********************");
    }
}