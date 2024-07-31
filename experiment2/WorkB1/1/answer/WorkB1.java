public class WorkB1 {
    public static void main(String[] args) {
        String[] fruitsArray = {"りんご", "バナナ", "オレンジ", "ぶどう", "イチゴ"};
        
        // 配列からArrayListへ変換
        java.util.ArrayList<String> fruitsList = new java.util.ArrayList<>();
        for(String fruit : fruitsArray) {
            fruitsList.add(fruit);
        }
        
        // 出力
        System.out.println("果物の種類: ");
        for(int i = 0; i < fruitsList.size(); i++) {
            System.out.println((i + 1) + ". " + fruitsList.get(i));
        }
    }
}