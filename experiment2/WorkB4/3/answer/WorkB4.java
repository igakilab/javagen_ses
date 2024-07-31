public class WorkB4 {
    public static void main(String[] args) {
        // ポイント履歴を保存するArrayListを作成
        java.util.ArrayList<Integer> pointHistory = new java.util.ArrayList<>();

        // Scannerクラスのインスタンスを作成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ポイントの入力を受け付ける
        System.out.println("ポイント履歴を入力してください。終了する場合は負の数を入力してください。");
        int point = Integer.parseInt(scanner.next());
        while (point >= 0) {
            pointHistory.add(point);
            point = Integer.parseInt(scanner.next());
        }

        // 最もポイントが多いユーザーを特定
        int maxPoint = 0;
        int maxIndex = 0;
        for (int i = 0; i < pointHistory.size(); i++) {
            if (pointHistory.get(i) > maxPoint) {
                maxPoint = pointHistory.get(i);
                maxIndex = i;
            }
        }

        // 最もポイントが多いユーザーのポイント履歴を削除
        if (pointHistory.contains(maxPoint)) {
            pointHistory.remove(maxIndex);
            System.out.println("最もポイントを獲得したユーザーのポイント履歴を削除しました。");
        }

        // Scannerクラスのインスタンスをクローズ
        scanner.close();
    }
}
