import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        long money;
        String result;

        money = Input.readData("금액 입력 : ");
        result = Compute.convertHangul(money);
        Output.display(money, result);
    }
}