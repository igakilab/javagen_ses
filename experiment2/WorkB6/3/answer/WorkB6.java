import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<ShopB6> shops = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("店舗の数を入力してください");
        int shopCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < shopCount; i++) {
            System.out.printf("店舗%dの商品の種類を入力してください\n", i + 1);
            String product = scanner.nextLine();

            System.out.printf("店舗%dの在庫数を入力してください\n", i + 1);
            int stock = Integer.parseInt(scanner.nextLine());

            System.out.printf("店舗%dの価格を入力してください\n", i + 1);
            int price = Integer.parseInt(scanner.nextLine());

            ShopB6 shop = new ShopB6(product, stock, price);
            shops.add(shop);
        }

        System.out.println("在庫移動を行います。");
        System.out.println("商品名を入力してください");
        String productToMove = scanner.nextLine();

        System.out.println("移動元の店舗番号を入力してください");
        int sourceShopIndex = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println("移動先の店舗番号を入力してください");
        int destinationShopIndex = Integer.parseInt(scanner.nextLine()) - 1;

        moveStock(shops, productToMove, sourceShopIndex, destinationShopIndex);

        System.out.println("在庫を補充します。");
        System.out.println("商品名を入力してください");
        String productToReplenish = scanner.nextLine();

        System.out.println("補充する店舗番号を入力してください");
        int replenishShopIndex = Integer.parseInt(scanner.nextLine()) - 1;

        replenishStock(shops, productToReplenish, replenishShopIndex);

        for (int i = 0; i < shops.size(); i++) {
            System.out.printf("店舗%d:\n", i + 1);
            shops.get(i).displayInfo();
        }

        scanner.close();
    }

    public static void moveStock(ArrayList<ShopB6> shops, String product, int sourceShopIndex, int destinationShopIndex) {
        int sourceIndex = -1, destinationIndex = -1;
        for (int i = 0; i < shops.size(); i++) {
            if (shops.get(i).getProduct().equals(product)) {
                if (sourceIndex == -1) {
                    sourceIndex = i;
                } else {
                    destinationIndex = i;
                    break;
                }
            }
        }

        if (sourceIndex != -1 && destinationIndex != -1) {
            int amountToMove = shops.get(sourceIndex).getStock();
            shops.get(sourceIndex).decreaseStock(amountToMove);
            shops.get(destinationIndex).increaseStock(amountToMove);
            System.out.printf("%sの在庫を店舗%dから店舗%dに移動しました。\n", product, sourceShopIndex + 1, destinationShopIndex + 1);
        } else {
            System.out.println("移動元もしくは移動先の商品が見つかりません。");
        }
    }

    public static void replenishStock(ArrayList<ShopB6> shops, String product, int replenishShopIndex) {
        int index = -1;
        for (int i = 0; i < shops.size(); i++) {
            if (shops.get(i).getProduct().equals(product)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            int currentStock = shops.get(index).getStock();
            shops.get(index).increaseStock(currentStock * 2);
            System.out.printf("%sの在庫を店舗%dで補充しました。\n", product, replenishShopIndex + 1);
        } else {
            System.out.println("補充する商品が見つかりません。");
        }
    }
}