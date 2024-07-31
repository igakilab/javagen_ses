import java.util.ArrayList;
import java.util.Scanner;

public class WorkB8 {
    public static void main(String[] args) {
        ArrayList<Jewel> jewels = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("宝石の種類を入力してください（終了する場合はexitと入力）");
            String input = sc.nextLine();

            if (input.equals("exit")) {
                break;
            }

            // 入力された宝石の名前を格納するJewelインスタンスを作成し、ArrayListに追加します。
            jewels.add(new Jewel(input));
        }

        System.out.println("保管された宝石一覧:");
        for (Jewel jewel : jewels) {
            System.out.println(jewel.getName());
        }

        sc.close();
    }
}