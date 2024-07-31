import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        int total = 0;

        System.out.print("学生の点数を入力してください (終了するには -1): ");

        int input = scanner.nextInt();
        while (input != -1) {
            scores.add(input);
            total += input;
            input = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }

        double average = (double) total / scores.size();

        System.out.println("合計点: " + total);
        System.out.println("平均点: " + String.format("%.2f", average));
    }
}
