import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        int[] votes = new int[5];
        int totalVoters = 16;
        int num;

        System.out.print("1~4번 중 투표할 후보 번호를 입력하세요.\n");

        for (int i = 1; i <= totalVoters; i++) {
            System.out.printf("%d번째 투표 >> ", i);
            num = keyboard.nextInt();

            if (num >= 1 && num <= 4) {
                votes[num]++;
            } else {
                votes[0]++;
                System.err.print("ERROR: 1~4번만 선택 가능\n");
                System.in.read();
            }
        }

        keyboard.close();

        System.out.print("\n    득표수        \n");
        System.out.printf("%-4s : %3d표%n", "1번", votes[1]);
        System.out.printf("%-4s : %3d표%n", "2번", votes[2]);
        System.out.printf("%-4s : %3d표%n", "3번", votes[3]);
        System.out.printf("%-4s : %3d표%n", "4번", votes[4]);
        System.out.printf("%-3s : %3d표%n", "무효표", votes[0]);

        int total = votes[0] + votes[1] + votes[2] + votes[3] + votes[4];
        System.out.printf("   총 %d표\n", total);
    }
}