public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<String> products = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> stock = new java.util.ArrayList<>();

        while (true) {
            System.out.println("メニューを選択してください:");
            System.out.println("1. 商品登録");
            System.out.println("2. 商品購入");
            System.out.println("3. 商品返品");
            System.out.println("4. 売上集計");
            System.out.println("5. 終了");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 改行読み捨て

            switch (choice) {
                case 1:
                    System.out.print("商品名を入力してください: ");
                    String product = scanner.nextLine();
                    System.out.print("在庫数を入力してください: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // 改行読み捨て

                    products.add(product);
                    stock.add(quantity);
                    System.out.println("商品を登録しました。");
                    break;

                case 2:
                    System.out.print("購入したい商品名を入力してください: ");
                    String purchaseProduct = scanner.nextLine();
                    int purchaseIndex = products.indexOf(purchaseProduct);

                    if (purchaseIndex != -1) {
                        System.out.print("購入数量を入力してください: ");
                        int purchaseQuantity = scanner.nextInt();
                        scanner.nextLine(); // 改行読み捨て

                        int currentStock = stock.get(purchaseIndex);
                        if (purchaseQuantity <= currentStock) {
                            stock.set(purchaseIndex, currentStock - purchaseQuantity);
                            System.out.println("商品を購入しました。");
                        } else {
                            System.out.println("在庫が不足しています。");
                        }
                    } else {
                        System.out.println("商品が見つかりません。");
                    }
                    break;

                case 3:
                    System.out.print("返品したい商品名を入力してください: ");
                    String returnProduct = scanner.nextLine();
                    int returnIndex = products.indexOf(returnProduct);

                    if (returnIndex != -1) {
                        System.out.print("返品数量を入力してください: ");
                        int returnQuantity = scanner.nextInt();
                        scanner.nextLine(); // 改行読み捨て

                        int currentStock = stock.get(returnIndex);
                        stock.set(returnIndex, currentStock + returnQuantity);
                        System.out.println("商品を返品しました。");
                    } else {
                        System.out.println("商品が見つかりません。");
                    }
                    break;

                case 4:
                    int totalSales = 0;
                    for (int i = 0; i < products.size(); i++) {
                        int quantitySold = stock.get(i);
                        int unitPrice = Math.max(1, quantitySold) * 1000; // 1個あたりの価格は最低1000円とする
                        totalSales += quantitySold * unitPrice;
                    }
                    System.out.printf("売上総額: %d円%n", totalSales);
                    break;

                case 5:
                    System.out.println("プログラムを終了します。");
                    scanner.close();
                    return;

                default:
                    System.out.println("無効な選択です。");
            }
        }
    }
}