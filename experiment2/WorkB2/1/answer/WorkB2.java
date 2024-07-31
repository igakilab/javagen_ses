import java.util.ArrayList;

public class WorkB2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        ArrayList<String> birthdays = new ArrayList<>();

        // System.out.print("友達の誕生日を入力してください。");
        int numOfFriends = scanner.nextInt();
        scanner.nextLine(); // バッファ内の改行文字をクリア

        for (int i = 0; i < numOfFriends; i++) {
            // System.out.printf("%d番目の名前と誕生日を入力してください。例: John 12月31日%n", i + 1);
            String nameAndBirthday = scanner.nextLine();
            birthdays.add(nameAndBirthday);
        }

        // 誕生日リストを出力
        for (int i = 0; i < birthdays.size(); i++) {
            String friend = birthdays.get(i);
            // System.out.printf("%d番目の友達: %s%n", i + 1, friend);
            System.out.println(friend);
        }

        scanner.close();
    }
}
