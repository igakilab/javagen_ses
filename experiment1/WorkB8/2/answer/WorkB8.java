import java.util.ArrayList;
import java.util.Scanner;

public class WorkB8 {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("新しいPersonオブジェクトを作成します。名前を入力してください:");
        String name = sc.nextLine();
        
        System.out.println("年齢を入力してください:");
        int age = Integer.parseInt(sc.nextLine());

        Person newPerson = new Person(name, age);
        personList.add(newPerson);

        System.out.println("新しいPersonオブジェクトをリストに追加しました。");
        
        // リスト内のPersonオブジェクトを表示
        System.out.println("現在のPersonリスト:");
        for (Person person : personList) {
            System.out.println(person.getName() + " (" + person.getAge() + "歳)");
        }
        
        sc.close();
    }
}