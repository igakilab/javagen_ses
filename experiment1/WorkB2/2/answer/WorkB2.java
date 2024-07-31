import java.util.ArrayList;

public class WorkB2 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(20);
        ages.add(25);
        ages.add(30);

        System.out.println("友達の年齢を当ててください（1番目の友達）:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == ages.get(0)) {
            System.out.println("正解！1番目の友達の年齢は" + ages.get(0) + "歳です。");
        } else {
            System.out.println("不正解..正解は" + ages.get(0) + "歳でした。");
        }

        scanner.close();
    }
}
