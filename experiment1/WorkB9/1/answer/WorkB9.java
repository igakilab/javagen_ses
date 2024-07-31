import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("学校に新入生が続々とやってきました！学生の名前を入力してください。入力が終わったら\"end\"と入力してください。");
        String name = sc.nextLine();

        // "end"が入力されるまで新入生の名前を受け付け、学生クラスのインスタンスをリストに追加します
        while (!name.equals("end")) {
            studentList.add(new Student(name));
            name = sc.nextLine();
        }

        System.out.println("\n学校のクラスリスト:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("学生" + (i + 1) + ": " + studentList.get(i).getName());
        }

        sc.close();
    }
}