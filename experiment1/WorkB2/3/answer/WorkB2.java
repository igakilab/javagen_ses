public class WorkB2 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    java.util.ArrayList<Integer> years = new java.util.ArrayList<>();

    // 受賞年の入力
    for (int i = 0; i < 5; i++) {
        // System.out.printf("%d回目の受賞年を入力してください。%n", i + 1);
        int year = scanner.nextInt();
        years.add(year);
    }

    // 判定用の年を入力
    // System.out.print("推測する受賞年を入力してください。");
    int guessYear = scanner.nextInt();

    if (years.get(0) == guessYear || years.get(1) == guessYear || years.get(2) == guessYear || years.get(3) == guessYear || years.get(4) == guessYear) {
        System.out.println("正解です！");
    } else {
        System.out.println("不正解です。");
    }

    scanner.close();
  }
}