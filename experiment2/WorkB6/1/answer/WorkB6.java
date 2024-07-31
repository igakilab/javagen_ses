import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<StudentB6> studentList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 10人分の生徒情報を入力してArrayListに格納する
        for (int i = 0; i < 10; i++) {
            System.out.println("生徒の名前を入力してください:");
            String name = sc.nextLine();
            System.out.println("生徒の成績を入力してください:");
            int score = Integer.parseInt(sc.nextLine());
            studentList.add(new StudentB6(name, score));
        }

        // 入力された生徒情報を表示する
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        sc.close();
    }
}