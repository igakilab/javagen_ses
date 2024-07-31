import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        // ArrayListを用意して、運動会の出場者リストを格納します。
        ArrayList<String> participants = new ArrayList<>();

        // Scannerクラスを用いて入力を受け取り、出場者リストに追加します。
        Scanner sc = new Scanner(System.in);
        System.out.println("運動会の出場者を入力してください。(終了は\"end\"を入力)");
        String input;
        while (!(input = sc.nextLine()).equalsIgnoreCase("end")) {
            participants.add(input);
        }

        // 出場者リストの人数を出力します。
        System.out.println("運動会の出場者リスト:");
        for (int i = 0; i < participants.size(); i++) {
            System.out.println((i + 1) + ". " + participants.get(i));
        }

        // Scannerクラスのインスタンスをクローズします。
        sc.close();
    }
}
