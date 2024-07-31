import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    public static void main(String[] args) {
        ArrayList<FriendB9> friendList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("友達の名前と誕生日を入力してください（名前が\"end\"の場合、入力を終了します）");
            String name = scanner.nextLine();
            
            // 名前が"end"の場合、入力を終了します
            if (name.equals("end")) {
                break;
            }

            String birthday = scanner.nextLine();
            friendList.add(new FriendB9(name, birthday));
        }

        System.out.println("友達の誕生日リスト");
        
        for (FriendB9 friend : friendList) {
            System.out.println(friend.getName() + " : " + friend.getBirthday());
        }

        scanner.close();
    }
}