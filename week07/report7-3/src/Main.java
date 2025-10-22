import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        float kor, eng, math;
        float avg = 0.0f;
        char grade = ' ';
        String result = "";

        //data 입력
        System.out.print("국어, 영어, 수학 점수는 (0~100점) ? ");
        kor = keyboard.nextFloat();
        eng = keyboard.nextFloat();
        math = keyboard.nextFloat();

        //처리
        avg = (kor + eng + math) / 3;
        if (avg <= 100) {
            if (avg >= 90) {
                grade = 'A';
                result = "성적 양호";
            } else if (avg >=80) {
                grade = 'B';
                result = "성적 양호";
            } else if (avg >=70) {
                grade = 'C';
                result = "노력";
            } else if (avg >=60) {
                grade = 'D';
                result = "노력";
            } else {
                grade = 'F';
                result = "성적 불량";
            }
            System.out.println("===============================");
            System.out.println(" 국어  영어  수학  평균  학점  결  과");
            System.out.printf(" %.0f   %.0f   %.0f  %.2f %c  %s \n",kor, eng, math, avg, grade, result);
            System.out.println("===============================");
        } else {
            System.err.println("ERROR : 점수는 0~100까지 입력 가능");
        }


    }
}