public class Main {
    public static void main(String[] args) {

        final int UP = 55;
        final int DOWN = 13;
        final int DEPTH = 300;
        int height = 0;
        int day;

        for (day = 1; day <= 7; day++) {
            height += UP;
            if (height >= DEPTH) {
                System.out.printf("달팽이는 %d일 만에 우물을 탈출!\n", day);
                return;
            }
            height -= DOWN;
            System.out.printf("%d일차 높이: %dcm\n", day, height);
        }
        System.out.println("달팽이는 방울꽃이 시들기 전에 우물을 탈출 못 함.");
    }
}

