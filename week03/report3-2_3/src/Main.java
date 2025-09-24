public class Main {
    public static void main(String[] args) {
        //준비물
        String school = "경복대학교";
        String name = "홍 길동";
        int age = 20;
        char gender = 'F'; //'M'은 남자, 'F'는 여자
        double height = 170.6;
        float weight = 65.4f;
        //data 입력

        //처리

        //출력
        System.out.println("*********************");
        System.out.printf("    학교 : %s\n", school);
        System.out.printf("    이름 : %s\n", name);
        System.out.printf("    나이 : %d\n", age);
        System.out.printf("    성별 : %c\n", (gender == 'M') ? '남' : '여');
        System.out.printf("    신장 : %.1f Cm \n", height);
        System.out.printf("    체중 : %.1f Kg \n", weight);
        System.out.println("*********************");

    }
}