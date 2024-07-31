import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<String> rainGear = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("雨具を用意しますか？ (Y/N)");
        String answer = sc.nextLine();

        if (answer.equals("Y")) {
            System.out.println("傘と長靴を用意しました。");
            rainGear.add("傘");
            rainGear.add("長靴");
        } else {
            System.out.println("雨具を用意していません。");
        }

        System.out.println("現在の雨具リスト:");
        for (int i = 0; i < rainGear.size(); i++) {
            System.out.println(rainGear.get(i));
        }

        sc.close();
    }
}
