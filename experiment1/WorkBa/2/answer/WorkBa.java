import java.util.Scanner;
import java.util.ArrayList;

public class WorkBa {
    public static void main(String[] args) {
        ArrayList<StudentBa> classA = new ArrayList<>();
        ArrayList<StudentBa> classB = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("新入生のクラス分けを行います。");
        System.out.println("学生の名前を入力してください。(終了するには q を入力)");

        // 入力された名前を元に学生インスタンスを作成し、クラスAかクラスBに判別して格納する
        while (true) {
            String name = sc.next();
            if (name.equals("q")) {
                break;
            }

            StudentBa student = new StudentBa(name);
            if (student.isClassA()) {
                classA.add(student);
            } else {
                classB.add(student);
            }
        }

        System.out.println("クラスA:");
        for (StudentBa student : classA) {
            System.out.println(student.getName());
        }

        System.out.println("クラスB:");
        for (StudentBa student : classB) {
            System.out.println(student.getName());
        }

        sc.close();
    }
}