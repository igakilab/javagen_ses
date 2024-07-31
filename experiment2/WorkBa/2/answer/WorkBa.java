import java.util.ArrayList;
import java.util.Scanner;

public class WorkBa {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // ユーザーによる学生の成績入力
        while (true) {
            System.out.println("学生の名前を入力してください（\"end\"で終了）:");
            String name = scanner.next();
            if (name.equals("end")) {
                break;
            }
            System.out.println("学生の点数を入力してください:");
            int score = scanner.nextInt();
            students.add(new Student(name, score));
        }

        // 平均点の計算
        int sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        double average = (double) sum / students.size();

        // 最高点の取得
        int maxScore = 0;
        for (Student student : students) {
            maxScore = Math.max(maxScore, student.getScore());
        }

        // 統計情報の表示
        System.out.println("平均点: " + String.format("%.2f", average));
        System.out.println("最高点: " + maxScore);

        scanner.close();
    }
}