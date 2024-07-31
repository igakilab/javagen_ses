import java.util.ArrayList;
import java.util.Scanner;

public class WorkBa {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("学生のデータを入力してください");
        while (true) {
            System.out.print("名前: ");
            String name = sc.next();
            if (name.equals("end")) {
                break;
            }
            System.out.print("年齢: ");
            int age = sc.nextInt();

            // Studentクラスのインスタンスを生成してArrayListに追加
            Student student = new Student(name, age);
            studentList.add(student);
        }

        // 登録した学生の情報を出力
        System.out.println("\n登録した学生の情報:");
        for (Student student : studentList) {
            student.printInfo();
        }

        // 入力用のScannerをクローズ
        sc.close();
    }
}