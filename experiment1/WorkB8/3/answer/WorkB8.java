import java.util.Scanner;
import java.util.ArrayList;

public class WorkB8 {
    public static void main(String[] args) {
        ArrayList<PersonB8> personList = new ArrayList<PersonB8>();
        Scanner sc = new Scanner(System.in);

        System.out.println("何人の情報を登録しますか？");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.printf("Person %dの名前を入力してください: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Person %dの年齢を入力してください: ", i + 1);
            int age = Integer.parseInt(sc.nextLine());

            personList.add(new PersonB8(name, age));
        }

        // 最年少のPersonオブジェクトを格納する変数
        PersonB8 youngest = personList.get(0);

        // 最年少のPersonオブジェクトを探す
        for (PersonB8 person : personList) {
            if (person.getAge() < youngest.getAge()) {
                youngest = person;
            }
        }

        System.out.println("最年少のPerson:");
        System.out.printf("名前: %s, 年齢: %d\n", youngest.getName(), youngest.getAge());

        sc.close();
    }
}