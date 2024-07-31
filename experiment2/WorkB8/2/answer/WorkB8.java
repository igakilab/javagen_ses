import java.util.ArrayList;
import java.util.Scanner;

public class WorkB8 {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("学生の名前と科目の成績を入力してください（名前が\"End\"の場合、入力終了）");

        while (true) {
            System.out.print("名前: ");
            String name = sc.nextLine();

            if (name.equals("End")) {
                break;
            }

            System.out.print("成績: ");
            int score = Integer.parseInt(sc.nextLine());

            Student student = new Student(name, score);
            studentList.add(student);
        }

        System.out.println("\n入力された成績一覧:");

        for (Student student : studentList) {
            System.out.println(student.getName() + ": " + student.getScore());
        }

        sc.close();
    }
}