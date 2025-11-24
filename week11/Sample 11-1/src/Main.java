//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
      //  int[][] test = new int[4][3];    //4행 3열
        int[][] test = new int[4][];       //뒤는 생략 가능, 앞은 생략 불가능
        test[0] = new int[3];
        test[1] = new int[2];
        test[2] = new int[3];
        test[3] = new int[2];

        //초기화 괄호 안에 3(박스숫자) 3(박스 안에 내용물 개수) 쓰면 오류임(시스템이 알아서 개수를 세줌)
        int[][] temp = new int[][] {{1,2,3}, {2,3,4}, {5,6,7}};


    }
}