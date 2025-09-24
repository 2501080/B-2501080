import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int radius = 0;
        double boxArea = 0.0;
        double circleArea = 0.0;
        double area = 0.0;

        //data 입력
        System.out.print("원의 반지름 : ");
        radius = keyboard.nextInt();

        //처리
        boxArea = (radius * 2) * (radius * 2);
        circleArea = radius * radius * Math.PI;
        area = boxArea - circleArea;
        //출력
        System.out.printf("\n정사각형 면적 : %.0f Cm2\n",boxArea);
        System.out.printf("원의 면적 : %.2f Cm2\n",circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2\n", area);
    }
}