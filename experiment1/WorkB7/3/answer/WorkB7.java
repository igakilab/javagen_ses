import java.util.ArrayList;
import java.util.Scanner;

public class WorkB7 {
    public static void main(String[] args) {
        // 生徒の名前を格納するArrayListを作成します
        ArrayList<String> students = new ArrayList<>();

        // Scannerクラスを用いて生徒の名前を入力し、リストに追加します
        Scanner sc = new Scanner(System.in);
        System.out.println("生徒の名前を入力してください（終了するには\"end\"を入力）");
        String input = sc.nextLine();
        while (!input.equals("end")) {
            students.add(input);
            input = sc.nextLine();
        }

        // 生徒の名前をアルファベット順に並べ替えます
        sortStudents(students);

        // 並べ替えたリストを出力します
        for (String student : students) {
            System.out.println(student);
        }

        // Scannerクラスのインスタンスをクローズします
        sc.close();
    }

    private static void sortStudents(ArrayList<String> students) {
        // バブルソートを用いて生徒の名前をアルファベット順に並べ替えます
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (compareNames(students.get(j), students.get(j + 1)) > 0) {
                    String temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
    }

    private static int compareNames(String name1, String name2) {
        // 文字列を小文字に変換して比較し、アルファベット順に並ぶようにします
        String lowerName1 = name1.toLowerCase();
        String lowerName2 = name2.toLowerCase();
        return lowerName1.compareTo(lowerName2);
    }
}
