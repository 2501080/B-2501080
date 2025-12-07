import java.util.Scanner;

public class Input {
    public static int[] readData() {
            Scanner keyboard = new Scanner(System.in);
            int[] num = new int[4];

            for (int i = 0; i < num.length; i++) {
                System.out.print((i + 1) + "번째 정수 입력: ");
                num[i] = keyboard.nextInt();
            }

            return num;
    }
}
