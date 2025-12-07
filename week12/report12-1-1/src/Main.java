import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] num;
        int result;

        num = Input.readData();
        result = Compute.max4(num);
        Output.display(result);
    }
}