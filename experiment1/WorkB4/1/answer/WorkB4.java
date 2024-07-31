public class WorkB4 {
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ArrayListのインスタンスを作成
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // ユーザーに整数値の入力を促すメッセージを表示
        System.out.println("整数値を入力してください。入力が終わったら0を入力してください。");

        // 整数値を入力し、リストに格納する
        int num;
        while ((num = scanner.nextInt()) != 0) {
            list.add(num);
        }

        // 重複データの削除処理
        int index = 0;
        while (index < list.size()) {
            int currentNum = list.get(index);
            if (list.contains(currentNum) && list.indexOf(currentNum) != index) {
                list.remove(index);
            } else {
                index++;
            }
        }

        // リストの内容を出力
        System.out.println("重複を削除した結果:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}