import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[][] info = new String[10][3];
        double[][] data = new double[10][5];
        final int NORMAL = 1200;


        for (int i = 0; i < 10; i++) {
            System.out.println();

            System.out.print("번호 입력: ");
            info[i][0] = keyboard.next();

            System.out.print("이름 입력: ");
            info[i][1] = keyboard.next();

            System.out.print("수도 구분 코드 입력(1~5): ");
            data[i][0] = keyboard.nextInt();

            System.out.print("사용량 입력 : ");
            data[i][1] = keyboard.nextDouble();
        }


        for (int i = 0; i < 10; i++) {
            int code = (int) data[i][0];

            String type = "";
            switch (code) {
                case 1: type = "가정용";
                        break;
                case 2: type = "영업용";
                        break;
                case 3: type = "공장용";
                        break;
                case 4: type = "관공서";
                        break;
                case 5: type = "군기관";
                        break;
            }

            int price = 0;
            switch (code) {
                case 1: price = 40;
                        break;
                case 2: price = 55;
                        break;
                case 3: price = 78;
                        break;
                case 4: price = 35;
                        break;
                case 5: price = 20;
                        break;
            }

            int use = (int) (data[i][1] + 0.5);
            int amount = use * price + NORMAL;
            double taxrate = 0;
            switch (code) {
                case 1: taxrate = 0.05;
                        break;
                case 2: taxrate = 0.035;
                        break;
                case 3: taxrate = 0.025;
                        break;
                case 4: taxrate = 0.015;
                        break;
                case 5: taxrate = 0;
                        break;
            }

            int tax = (int)((amount * taxrate) / 10 ) * 10;
            double total = amount + tax;

            info[i][2] = type;
            data[i][2] = amount;
            data[i][3] = tax;
            data[i][4] = total;
        }


        System.out.println("           수    도    요    금              ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("  번호   이름     구분     사용량    사용금액       세금         납부금액");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("  %s\t%s\t%s\t%.1f\t%,.0f\t\t%,4d     %,.0f\n",
                    info[i][0], info[i][1], info[i][2], data[i][1], data[i][2],
                    (int)data[i][3], data[i][4]);
        }
        System.out.println("-------------------------------------------------------------------");

    }


}
