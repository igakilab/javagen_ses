import java.util.ArrayList;
import java.util.Scanner;

public class WorkB8 {
    public static void main(String[] args) {
        ArrayList<ShopItemB8> itemList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 商品情報を入力し、ArrayListに格納する
        while (true) {
            System.out.println("商品情報を入力してください（商品名 価格 在庫数）");
            String input = sc.nextLine();

            // ユーザが入力を終了する場合、ループを抜ける
            if (input.equals("end")) {
                break;
            }

            // スペースで分割して商品情報を取得
            String[] data = separateInput(input);

            // 商品名、価格、在庫数を取得してShopItemB8クラスのインスタンスを生成し、ArrayListに追加
            String itemName = data[0];
            int price = Integer.parseInt(data[1]);
            int stock = Integer.parseInt(data[2]);
            itemList.add(new ShopItemB8(itemName, price, stock));
        }

        // 在庫数の合計と売り上げの合計を計算
        int totalStock = 0;
        int totalSales = 0;
        for (ShopItemB8 item : itemList) {
            totalStock += item.getStock();
            totalSales += item.getStock() * item.getPrice();
        }

        // 結果を出力
        System.out.println("総在庫数: " + totalStock);
        System.out.println("総売り上げ: " + totalSales);

        sc.close();
    }

    private static String[] separateInput(String input) {
        String[] result = new String[3];
        int spaceIndex1 = input.indexOf(' ');
        int spaceIndex2 = input.indexOf(' ', spaceIndex1 + 1);

        result[0] = input.substring(0, spaceIndex1);
        result[1] = input.substring(spaceIndex1 + 1, spaceIndex2);
        result[2] = input.substring(spaceIndex2 + 1);

        return result;
    }
}