import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static int readData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int year;

        while (true) {
            System.out.print("년도 : ");
            year = keyboard.nextInt();

            if (year > 0)
                return year;
            else {
                System.err.println("ERROR : 1 이상의 정수를 입력");
                System.in.read();
            }
        }
    }
}