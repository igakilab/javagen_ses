import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 商品の価格を入力してリストに格納
        ArrayList<Integer> prices = new ArrayList<>();
        System.out.print("商品の価格を入力してください（終了する場合は負の数を入力）: ");
        int price = scanner.nextInt();
        while (price >= 0) {
            prices.add(price);
            System.out.print("商品の価格を入力してください（終了する場合は負の数を入力）: ");
            price = scanner.nextInt();
        }

        // 割引率を入力
        System.out.print("割引率を入力してください（0～100の間で入力）: ");
        int discountRate = scanner.nextInt();
        
        // 割引額を計算して表示
        System.out.println("割引額一覧:");
        for (int i = 0; i < prices.size(); i++) {
            int discountedPrice = prices.get(i) * discountRate / 100;
            System.out.println("商品" + (i+1) + ": " + discountedPrice);
        }

        scanner.close();
    }
}
