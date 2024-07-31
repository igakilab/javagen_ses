import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentB6> studentList = new ArrayList<>();

        System.out.println("新入生の名簿作成を開始します。");
        
        // 3人の新入生の情報を入力し、それぞれStudentB6クラスのインスタンスをstudentListに追加します
        for (int i = 0; i < 3; i++) {
            System.out.println("新入生の名前を入力してください:");
            String name = sc.nextLine();
            System.out.println("新入生の年齢を入力してください:");
            int age = Integer.parseInt(sc.nextLine());
            StudentB6 student = new StudentB6(name, age);
            studentList.add(student);
        }

        System.out.println("\n新入生の名簿:");
        for (int i = 0; i < studentList.size(); i++) {
            StudentB6 student = studentList.get(i);
            System.out.println("名前: " + student.getName() + ", 年齢: " + student.getAge());
        }

        sc.close();
    }
}