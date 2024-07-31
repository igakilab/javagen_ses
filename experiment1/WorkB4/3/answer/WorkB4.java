public class WorkB4 {
    public static void main(String[] args) {
        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ArrayListを作成
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // ユーザーからの入力を受け取り、リストに追加
        System.out.println("数字を入力してください。(終了する場合は0を入力)");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        
        // 入力された数字を表示
        System.out.print("入力された数字: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        // 検索する数字を入力
        System.out.println("削除する数字を入力してください:");
        int target = scanner.nextInt();

        // 検索して削除
        if (list.contains(target)) {
            list.remove((Integer) target);
            System.out.println(target + " を削除しました。");
        } else {
            System.out.println(target + " はリスト内に存在しません。");
        }

        // 残った数字を表示
        System.out.print("残った数字: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}