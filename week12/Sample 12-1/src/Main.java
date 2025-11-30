import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int first, second;
        int result;

        Output.display();                              //call by name
        first = Input.readData("첫번째 데이터 : ");  //call by value
        second = Input.readData("두번째 데이터 : ");
        /*
        System.out.print("첫 번째 정수 입력 : ");
        first = keyboard.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        second = keyboard.nextInt();  */

        result = Compute.add(first, second);  //여기서의 first, second는 실메개변수
       // result = first + second;

        Output.display(first, second, result);
        //System.out.printf("%d + %d = %d\n", first, second, result);
        Output.display();
    }
/*
    private static void display(int first, int second, int result) {
        //void는 아무것도 없는 것이라 return 없어도 됨
        System.out.printf("%d + %d = %d\n", first, second, result);
    }

    private static int add(int first, int second) {//first, second : 형식메개변수
        int result;
        result = first + second;
        return result;
    }

    private static int readData(String msg) {
        //메소드 헤더 { 바디 }
        Scanner keyboard = new Scanner(System.in);
        int temp;
        System.out.print(msg);
        temp = keyboard.nextInt();
        return temp;   //return하는 값이 int
    }*/
}