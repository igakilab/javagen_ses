public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<String> products = new java.util.ArrayList<>();

        System.out.print("商品の在庫数を入力してください: ");
        int inventoryCount = scanner.nextInt();
        scanner.nextLine(); // 改行文字を取り除く

        // 在庫管理
        for (int i = 1; i <= inventoryCount; i++) {
            System.out.printf("商品%dの名前を入力してください: ", i);
            String product = scanner.nextLine();
            products.add(product);
        }

        // 商品名で検索
        System.out.print("検索する商品名を入力してください: ");
        String searchProduct = scanner.nextLine();

        int index = products.indexOf(searchProduct);
        if (index != -1) {
            System.out.printf("%s は商品%dに見つかりました。%n", searchProduct, index + 1);
        } else {
            System.out.println("指定された商品は見つかりませんでした。");
        }

        scanner.close();
    }
}