import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        int ch = 0;
        int convert = 0;

        //data 입력
        System.out.print("하나의 영 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        //처리
        convert = (ch >= 'A' && ch <= 'Z') ? (ch + 32) :
                  (ch >= 'a' && ch <= 'z') ? (ch -32) : 0;

        //출력
        System.out.printf(
                (convert == 0) ?
                        "영문자가 아닙니다.\n" :
                        (ch >= 'A' && ch <= 'Z') ?
                                ("입력문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.\n") :
                                ("입력문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.\n"), ch, convert);
    }
}