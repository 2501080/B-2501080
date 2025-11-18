import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        String[] name = {"이대한", "홍길동", "한나라", "이순신", "김혜속",
                "김현호", "나희영", "이동국", "박예림", "김동근"};

        String[] hakbun = {"1601007", "1601003", "1601013", "1601024", "1601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"};


        double[] mid = new double[name.length];
        double[] fin = new double[name.length];
        double[] quiz = new double[name.length];
        double[] report = new double[name.length];
        double[] attend = new double[name.length];
        double[] total = new double[name.length]; // 가중 평균
        boolean swapped = false;

        int i = 0;


        while (i < name.length) {
            System.out.printf("\n%s 학생의 중간 점수 입력 : ", name[i]);
            mid[i] = keyboard.nextDouble();

            System.out.printf("%s 학생의 기말 점수 입력 : ", name[i]);
            fin[i] = keyboard.nextDouble();

            System.out.printf("%s 학생의 퀴즈 점수 입력 : ", name[i]);
            quiz[i] = keyboard.nextDouble();

            System.out.printf("%s 학생의 과제 점수 입력 : ", name[i]);
            report[i] = keyboard.nextDouble();

            System.out.printf("%s 학생의 출석 점수 입력 : ", name[i]);
            attend[i] = keyboard.nextDouble();

            if ((mid[i] >= 0 && mid[i] <= 100) &&
                    (fin[i] >= 0 && fin[i] <= 100) &&
                    (quiz[i] >= 0 && quiz[i] <= 100) &&
                    (report[i] >= 0 && report[i] <= 100) &&
                    (attend[i] >= 0 && attend[i] <= 100)) {

                total[i] = mid[i] * 0.15 +
                        fin[i] * 0.15 +
                        quiz[i] * 0.10 +
                        report[i] * 0.40 +
                        attend[i] * 0.20;
                i++;

            } else {
                System.err.println("ERROR : 점수는 0 ~ 100 범위만 입력 가능");
                System.in.read();
            }
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < name.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {

                    double temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;

                    double t2 = mid[j];
                    mid[j] = mid[j + 1];
                    mid[j + 1] = t2;

                    t2 = fin[j];
                    fin[j] = fin[j + 1];
                    fin[j + 1] = t2;

                    t2 = quiz[j];
                    quiz[j] = quiz[j + 1];
                    quiz[j + 1] = t2;

                    t2 = report[j];
                    report[j] = report[j + 1];
                    report[j + 1] = t2;

                    t2 = attend[j];
                    attend[j] = attend[j + 1];
                    attend[j + 1] = t2;

                    String ts = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = ts;

                    ts = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = ts;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("***************************************************************");
        System.out.println(" 학번      이름     중간   기말   퀴즈   과제   출석    점수");
        System.out.println("***************************************************************");

        for (i = 0; i < name.length; i++) {
            System.out.printf(" %s  %3s  %4.0f  %4.0f  %4.0f  %4.0f  %4.0f   %6.2f\n",
                    hakbun[i], name[i], mid[i], fin[i], quiz[i], report[i], attend[i], total[i]);
        }

        System.out.println("***************************************************************");
    }
}