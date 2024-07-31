public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<String> fruits = new java.util.ArrayList<>();

        // 在庫の追加
        // System.out.println("在庫に追加する果物の数を入力してください:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            // System.out.printf("果物%dを入力してください:%n", i + 1);
            String fruit = scanner.nextLine();
            fruits.add(fruit);
        }

        // 在庫確認
        // System.out.println("在庫の果物名を入力してください:");
        String inputFruit = scanner.nextLine();

        int index = fruits.indexOf(inputFruit);
        if (index != -1) {
            System.out.printf("%s の在庫があります。%n", fruits.get(index));
        } else {
            System.out.println("その果物は在庫にありません。");
        }

        scanner.close();
    }
}