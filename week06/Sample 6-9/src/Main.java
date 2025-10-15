import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //준비물
        Scanner keyboard = new Scanner(System.in);
        final int CIGAR = 7;
        int year;
        int gapi;
        int result;
        int hour;
        int day;

        //data 입력
        System.out.print("당신은 하루에 몇 개피를 피우나요? ");
        gapi = keyboard.nextInt();
        System.out.print("당신은 몇 년 동안 담배를 피웠나요? ");
        year = keyboard.nextInt();

        //처리
        result = CIGAR * gapi * year * 365;
        hour= result / 60;
        day = hour / 24;


        //출력
        System.out.printf("담배 1개피는 수명을 %d분 단축합니다.\n", CIGAR);
        System.out.printf("담배를 %d년 동안 하루에 평균 %d개피를 피웠다.\n ",year, gapi);
        System.out.printf("그러면 수명이 %,d분(%,d 시간, %d일) 단축됩니다.\n", result, hour, day);
    }
}