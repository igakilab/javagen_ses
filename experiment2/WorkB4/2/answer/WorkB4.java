import java.util.ArrayList;

public class WorkB4 {
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 数字を入力してもらうループ
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            System.out.print("数字を入力してください (終了するには'0'を入力): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numbers.add(num);
        }

        // 平均値を計算
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.size();
        System.out.println("平均値: " + String.format("%.2f", average));

        // 最大値を探して削除
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("最大値: " + max);

        if (numbers.contains(max)) {
            numbers.remove(numbers.indexOf(max));
        }

        // 結果を表示
        System.out.print("削除後の数字: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}
