import java.util.ArrayList;
import java.util.Scanner;

public class WorkB7 {
    public static void main(String[] args) {
        // 注文アイテムを格納するArrayListを宣言
        ArrayList<Item> cart = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("商品名を入力してください（終了する場合はexitを入力）:");
            input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else {
                // 入力された商品名を元にItemクラスのインスタンスを作成し、cartに追加
                cart.add(new Item(input));
            }
        }

        // 合計金額を初期化
        int total = 0;

        System.out.println("カート内の商品一覧:");
        for (Item item : cart) {
            System.out.println(item.getName());
            // 各アイテムの価格を合計金額に加算
            total += item.getPrice();
        }

        System.out.printf("合計金額は %d 円です\n", total);

        scanner.close();
    }
}