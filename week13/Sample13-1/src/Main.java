import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        String[] name = {"홍길동", "이순신", "김지민", "이예린"};  //5개

       // int[] score = new int[name.length];  //5개
        int[][] score = Input.inputData(name);    //Input 안에 name.length 5개를 score가 참조
        Compute.process(score);
        Output.display(name, score);


    }
}