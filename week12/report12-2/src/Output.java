public class Output {
    public static void display(boolean result, int year) {

        if (result)
            System.out.printf("%d년도는 윤년입니다.\n", year);
        else
            System.out.printf("%d년도는 윤년이 아닙니다.\n", year);
    }
}
