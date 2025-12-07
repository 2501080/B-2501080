import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static long readData(String msg) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(msg);

        if (!keyboard.hasNextLong()) {
            System.err.println("ERROR: 숫자만 입력 가능합니다.");
            System.in.read();
            return readData(msg);   // 다시 입력받기
        }

        long temp = keyboard.nextLong();

        if (temp < 0) {
            System.err.println("ERROR: 정수만 입력 가능");
            System.in.read();
            return readData(msg);
        }

        return temp;
    }
}

