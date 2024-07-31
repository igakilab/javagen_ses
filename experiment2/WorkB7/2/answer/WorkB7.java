import java.util.Scanner;
import java.util.ArrayList;

public class WorkB7 {
    public static void main(String[] args) {
        ArrayList<StudentB7> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 3人の学生の成績を入力し、StudentB7クラスのインスタンスを生成してstudentsに追加する
        for (int i = 0; i < 3; i++) {
            System.out.print("学生の氏名を入力してください: ");
            String name = sc.nextLine();
            System.out.print("学生の得点を入力してください: ");
            int score = Integer.parseInt(sc.nextLine());
            students.add(new StudentB7(name, score));
        }

        // 平均点を計算する
        int sum = 0;
        for (StudentB7 student : students) {
            sum += student.getScore();
        }
        double average = (double) sum / students.size();
        System.out.printf("平均点: %.2f\n", average);

        // 最高得点を計算する
        int maxScore = Integer.MIN_VALUE;
        for (StudentB7 student : students) {
            maxScore = Math.max(maxScore, student.getScore());
        }
        System.out.println("最高得点: " + maxScore);

        sc.close();
    }
}