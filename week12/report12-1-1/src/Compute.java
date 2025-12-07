public class Compute {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max4(int[] num) {
        int result = num[0];

        for (int i = 1; i < num.length; i++) {
            result = max(result, num[i]);
        }
        return result;
    }
}