import java.util.ArrayList;
import java.util.Scanner;

public class WorkB7 {
    public static void main(String[] args) {
        ArrayList<Friend> birthdayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 3人の友達の誕生日を入力してリストに追加する
        for (int i = 0; i < 3; i++) {
            System.out.println("友達の名前を入力してください:");
            String name = sc.nextLine();
            System.out.println("友達の誕生日を入力してください:");
            String birthday = sc.nextLine();
            birthdayList.add(new Friend(name, birthday));
        }

        // リストの中身を表示する
        System.out.println("友達の誕生日リスト:");
        for (Friend friend : birthdayList) {
            System.out.println(friend.getName() + "の誕生日: " + friend.getBirthday());
        }

        sc.close();
    }
}