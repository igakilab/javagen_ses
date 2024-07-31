import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    public static void main(String[] args) {
        ArrayList<Store> storeList = new ArrayList<>();

        // 3つの店舗の在庫情報を入力
        System.out.println("各店舗の在庫情報を入力してください。");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.print("店舗名: ");
            String storeName = sc.nextLine();

            System.out.print("商品名: ");
            String itemName = sc.nextLine();

            System.out.print("在庫数: ");
            int stock = Integer.parseInt(sc.nextLine());

            storeList.add(new Store(storeName, itemName, stock));
        }

        // 各店舗の在庫情報を表示
        for (Store store : storeList) {
            System.out.printf("%sの%sの在庫数: %d\n", store.getStoreName(), store.getItemName(), store.getStock());
        }

        // 売上データの入力と集計
        int totalSales = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("各店舗の売上データを入力してください。");
        for (Store store : storeList) {
            System.out.print(store.getStoreName() + "の売上: ");
            int sales = Integer.parseInt(sc.nextLine());
            totalSales += sales;
            store.updateStock(-sales);
        }

        // 総売上額を表示
        System.out.printf("総売上額: %d\n", totalSales);

        // 在庫情報を更新した後の各店舗の在庫情報を表示
        for (Store store : storeList) {
            System.out.printf("%sの%sの在庫数: %d\n", store.getStoreName(), store.getItemName(), store.getStock());
        }

        sc.close();
    }
}