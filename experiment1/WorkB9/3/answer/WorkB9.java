import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    public static void main(String[] args) {
        ArrayList<ItemB9> items = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 初期在庫の登録
        items.add(new ItemB9("Apple", 10));
        items.add(new ItemB9("Banana", 20));
        items.add(new ItemB9("Orange", 15));

        System.out.println("現在の商品在庫状況:");
        for (ItemB9 item : items) {
            System.out.println(item);
        }

        System.out.println("商品の在庫を更新します。");
        System.out.print("更新したい商品名を入力してください: ");
        String target = sc.nextLine();
        
        System.out.print("追加・減少させる数量を入力してください: ");
        int quantity = Integer.parseInt(sc.nextLine());

        boolean found = false;
        for (ItemB9 item : items) {
            if (item.getName().equalsIgnoreCase(target)) {
                item.updateStock(quantity);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("該当する商品が見つかりませんでした");
        }

        System.out.println("更新後の商品在庫状況:");
        for (ItemB9 item : items) {
            System.out.println(item);
        }

        sc.close();
    }
}