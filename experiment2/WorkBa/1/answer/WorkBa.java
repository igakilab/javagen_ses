import java.util.ArrayList;
import java.util.Scanner;

public class WorkBa {
    public static void main(String[] args) {
        // ArrayListを作成してfruitsという変数に格納します。
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        Scanner sc = new Scanner(System.in);

        System.out.println("フルーツを追加します。追加する果物の名前を入力してください。");
        String fruitName = sc.next();
        // Fruitクラスのインスタンスを作成してfruitsに追加します。
        fruits.add(new Fruit(fruitName));

        System.out.println("フルーツの在庫を確認します。");
        for (Fruit fruit : fruits) {
            System.out.println("在庫に" + fruit.getName() + "が" + fruit.getQuantity() + "個あります。");
        }

        System.out.println("スキャナーをクローズします。");
        sc.close();
    }
}