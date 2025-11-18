import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int total = 0;
        int max = 0;
        int min = 100;
        int num;
        float average;

        System.out.println("10개의 정수 데이터 입력 (0~100 사이)");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d : ", i);
            num = keyboard.nextInt();

            if (num < 0 || num > 100) {
                System.err.println("ERROR: 점수는 0~100 사이여야 합니다.");
                System.in.read();
                i--;
                continue;
            }

            total += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        keyboard.close();

        average = (float) total / 10;

        System.out.println("\n출력 결과");
        System.out.printf("합계 :  %d%n", total);
        System.out.printf("평균 :  %.2f%n", average);
        System.out.printf("최대값 : %d%n", max);
        System.out.printf("최소값 : %d%n", min);
    }
}