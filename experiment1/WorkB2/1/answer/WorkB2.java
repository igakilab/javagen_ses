import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> years = new ArrayList<>();
        years.add(1990);
        years.add(2000);
        years.add(2010);
        years.add(2020);

        System.out.print("年数を入力してください: ");
        int inputYear = scanner.nextInt();

        boolean isContained = false;
        for (int i = 0; i < years.size(); i++) {
            if (years.get(i) == inputYear) {
                isContained = true;
                break;
            }
        }

        if (isContained) {
            System.out.println("入力された年はリストに含まれています。");
        } else {
            System.out.println("入力された年はリストに含まれていません。");
        }

        scanner.close();
    }
}
