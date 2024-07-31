import java.util.ArrayList;
import java.util.Scanner;

public class WorkB7 {
    public static void main(String[] args) {
        //生徒を格納するArrayListを作成します。
        ArrayList<StudentB7> students = new ArrayList<>();

        //生徒を3人登録します。
        students.add(new StudentB7("Alice"));
        students.add(new StudentB7("Bob"));
        students.add(new StudentB7("Charlie"));

        System.out.println("生徒一覧:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        System.out.println("削除する生徒の名前を入力してください:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().trim(); //入力された名前を取得します。

        //入力された名前の生徒がArrayList内に存在するか確認します。
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                //名前が一致した場合、その生徒を削除します。
                students.remove(i);
                System.out.println("生徒 " + name + " を削除しました。");
                break;
            }
        }

        System.out.println("削除後の生徒一覧:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }

        //Scannerをクローズします。
        sc.close();
    }
}