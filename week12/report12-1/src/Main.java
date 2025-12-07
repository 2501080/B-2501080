import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int num1, num2;
        int result;

        num1 = Input.readData("첫번째 숫자 : ");
        num2 = Input.readData("두번째 숫자 : ");
        result = Compute.max(num1, num2);
        Output.display(result);
    }
}