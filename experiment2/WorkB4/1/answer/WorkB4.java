public class WorkB4 {
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ArrayListを作成して10匹の動物を追加
        java.util.ArrayList<String> animals = new java.util.ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("bird");
        animals.add("lion");
        animals.add("elephant");
        animals.add("monkey");
        animals.add("tiger");
        animals.add("bear");
        animals.add("horse");
        animals.add("rabbit");

        // 削除対象の動物を入力してもらう
        System.out.println("削除する動物を3つ入力してください。");
        for (int i = 0; i < 3; i++) {
            String deleteAnimal = scanner.next();
            // 動物のリストに存在するかチェック
            if (animals.contains(deleteAnimal)) {
                // 存在する場合は削除
                animals.remove(deleteAnimal);
                System.out.println(deleteAnimal + " を削除しました。");
            } else {
                System.out.println(deleteAnimal + " は見つかりませんでした。");
            }
        }

        // 動物のリストを表示
        System.out.println("残りの動物リスト:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}