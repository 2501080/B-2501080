//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        boolean test = ((('a' + 1) > 'A') && ('A' > 'B'));
        //'b' > 'A' -> true &&(*) false -> false
        boolean test1 = ((('a' + 1) > 'A') || ('A' > 'B'));
        //'b' > 'A' -> true ||(+) ? -> true

        int a = 5;

        boolean test2 = ((5 > 3) && ((a++) != 0)); // true * true -> true, a = 6
        // 1. a++  2. 5 > 3  3. a++ != 0



        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b, a =%d\n", test2, a);

        boolean test3 = ((2 > 3) & ((++a) != 0)); // false * ? -> false, a = 7
        //이때는 뒤에 계산 안 해서 a+1이 되지 않음
        // ++a여도 변함없이 계산 안함
        System.out.printf("test3 = %b, a =%d\n", test3, a);

        boolean test4 = ((2 > 3) & ((++a) != 0));
        System.out.printf("test4 = %b, a =%d\n", test4, a);

    }
}