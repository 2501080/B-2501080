public class Output {

    //Method Overload (중복 정의)
    static void display(int first, int second, int result) {
        //void는 아무것도 없는 것이라 return 없어도 됨
        System.out.printf("%d + %d = %d\n", first, second, result);
    }
    static void display(int first, int second) {
        System.out.printf("%d + %d =", first, second);
    }

    static void display() {
        System.out.println("***********************************");

    }
}
