public class WorkB4 {
    public static void main(String[] args) {
        // ArrayListのインスタンスを作成
        java.util.ArrayList<String> names = new java.util.ArrayList<>();

        // 要素を追加
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // 入力を促すメッセージ
        System.out.println("検索したい氏名を入力してください：");

        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 入力された氏名を取得
        String searchName = scanner.next();

        // 検索したい名前がリストに含まれているか確認
        if (names.contains(searchName)) {
            System.out.println(searchName + " はリストに含まれています。");

            // 指定した名前をリストから削除する
            names.remove(searchName);

            // 削除後のリストを表示
            System.out.println("削除後の氏名リスト:");
            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }

        } else {
            System.out.println(searchName + " はリストに含まれていません。");
        }

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}