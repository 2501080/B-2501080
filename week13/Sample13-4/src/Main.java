import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        //입력
        String[][] customers = new String[][] {{"1111", "문초연", "1", ""},
                {"2222","김지원", "2", ""}, {"3333","유주원", "3", ""}, {"4444","류하원", "3", ""},
                {"5555","양소영", "4", ""}, {"6666","도정민", "5", ""}, {"7777","박시현", "3", ""},
                {"8888","강혜원", "2", ""}, {"9999","신서현", "1", ""}, {"1010","윤예영", "4", ""}}; //{번호, 이름, 타입, 타입 이름}
        int[][] money = new int[customers.length][3]; // {사용금액, 세금, 징수금액}

        Input.preProcess(customers);
        float [] used = Input.readData(customers);

        //처리
        for (int i = 0; i < money.length; i++) {
            Compute.pay(money[i], customers[i], used[i]);    //사용 금액 계산
        }

        Compute.tax(customers, money); // 2차원

        for (int i = 0 ; i < money.length; i++){
            Compute.total(money[i]);
        }

        //출력
        Output.display(customers, money, used);
    }
}