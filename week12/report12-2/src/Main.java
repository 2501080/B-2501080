import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        int year;
        boolean result;

        year = Input.readData();
        result = Compute.leapYear(year);
        Output.display(result, year);
    }
}