import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> scores = new ArrayList<>();

        // 生徒の点数を入力
        for (int i = 0; i < 5; i++) {
            // System.out.printf("%d番目の生徒の点数を入力してください: ", i + 1);
            int score = scanner.nextInt();
            scores.add(score);
        }

        // 平均点と最高点を計算
        int total = 0;
        int max = scores.get(0);
        for (int i = 0; i < scores.size(); i++) {
            total += scores.get(i);
            max = Math.max(max, scores.get(i));
        }
        double average = (double) total / scores.size();

        System.out.printf("平均点: %.2f%n", average);
        System.out.println("最高点: " + max);

        scanner.close();
    }
}
