import java.util.ArrayList;

public class WorkB1 {
    public static void main(String[] args) {
        // 点数を格納する配列
        int[] scores = {85, 92, 78, 88, 90};

        // ArrayList に配列の要素を移動
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            scoreList.add(scores[i]);
        }

        // 平均点を計算
        int sum = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }
        double average = (double) sum / scoreList.size();

        // 結果を出力
        System.out.printf("点数の一覧: %s%n", scoreList);
        System.out.printf("平均点: %.2f%n", average);
    }
}
