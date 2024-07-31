import java.util.ArrayList;

public class WorkB1 {
    public static void main(String[] args) {
        // 都道府県の人口データを配列からArrayListに移行する
        String[] prefectures = {"東京", "大阪", "福岡"};
        int[] populations = {13929201, 8839469, 5269592};

        ArrayList<String> prefectureList = new ArrayList<>();
        ArrayList<Integer> populationList = new ArrayList<>();

        for (int i = 0; i < prefectures.length; i++) {
            prefectureList.add(prefectures[i]);
            populationList.add(populations[i]);
        }

        // 都道府県ごとの人口データを出力
        System.out.println("都道府県ごとの人口データ:");
        for (int i = 0; i < prefectureList.size(); i++) {
            String prefecture = prefectureList.get(i);
            int population = populationList.get(i);
            System.out.println(prefecture + "の人口: " + population);
        }
    }
}
