import java.util.ArrayList;
import java.util.Scanner;

public class WorkB7 {
    public static void main(String[] args) {
        ArrayList<StudentB7> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 生徒の名前を入力してもらう
        System.out.println("新しい生徒の名前を入力してください:");
        String name = sc.nextLine();

        // 生徒の性別を入力してもらう
        System.out.println("新しい生徒の性別を入力してください (男性/女性):");
        String gender = sc.nextLine();

        // 新しい生徒情報をStudentB7クラスのインスタンスとして作成し、studentListに追加する
        studentList.add(new StudentB7(name, gender));

        System.out.println("新しい生徒が登録されました。");

        // 入力を終了するため、Scannerをクローズする
        sc.close();
    }
}