import java.util.Scanner;
import java.util.ArrayList;

public class WorkB8 {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();

        Scanner sc = new Scanner(System.in);
        // ユーザーから3人の情報を入力してArrayListに格納する
        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter age:");
            int age = Integer.parseInt(sc.nextLine());
            
            // Personクラスの新しいインスタンスを生成し、ArrayListに追加する
            people.add(new Person(name, age));
        }

        // 年齢の合計を求める
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }

        // 結果を出力する
        System.out.println("Total age: " + totalAge);

        sc.close();
    }
}