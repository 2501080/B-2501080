import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        String school = "";
        String name = "";
        int age = 0;
        char gender = ' ';
        double height = 0.0;
        float weight = 0.0f;
        //data 입력
        System.out.print("학교를 입력하세요. ");
        school = keyboard.nextLine();
        System.out.print("이름을 입력하세요. ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는? ",name);
        age = keyboard.nextInt();
        System.out.printf("%s님의 성별은? (남/여) ",name);
        gender = keyboard.next().charAt(0);
        System.out.printf("%s님의 키는? ",name);
        height = keyboard.nextDouble();
        System.out.printf("%s님의 몸무게는? ",name);
        weight = keyboard.nextFloat();
        //처리

        //출력
        System.out.println("*********************");
        System.out.printf("    학교 : %s\n", school);
        System.out.printf("    이름 : %s\n", name);
        System.out.printf("    나이 : %d\n", age);
        System.out.printf("    성별 : %c\n", gender);
        System.out.printf("    신장 : %.1f Cm \n", height);
        System.out.printf("    체중 : %.1f Kg \n", weight);
        System.out.println("*********************");

    }
}