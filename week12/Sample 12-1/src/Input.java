import java.util.Scanner;
public class Input {
    static int readData(String msg) {
        //메소드 헤더 { 바디 }
        Scanner keyboard = new Scanner(System.in);
        int temp;
        System.out.print(msg);
        temp = keyboard.nextInt();

        return temp;   //return하는 값이 int
    }
}
