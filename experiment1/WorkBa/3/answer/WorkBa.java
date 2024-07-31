import java.util.ArrayList;
import java.util.Scanner;

public class WorkBa {
    public static void main(String[] args) {
        ArrayList<MemberBa> members = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("メンバー名を入力してください（\"exit\"で終了）: ");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }

            // メンバー名を引数にしてMemberBaクラスのインスタンスを生成し、ArrayListに追加します。
            members.add(new MemberBa(input));
        }

        System.out.println("\n部活動のメンバー一覧:");
        for (MemberBa member : members) {
            System.out.println(member.getName());
        }

        scanner.close();
    }
}