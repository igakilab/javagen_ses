import java.util.Scanner;

public class WorkB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 入力を受け取る
        // System.out.println("文字列を入力してください。");
        String input = scanner.nextLine();

        // 検索する文字列
        String searchStr = "apple";

        // 置換する文字列
        String replaceStr = "orange";

        // 入力された文字列に検索する文字列が含まれているかチェック
        if (input.contains(searchStr)) {
            // 検索する文字列を置換する
            String result = input.replace(searchStr, replaceStr);
            System.out.println("置換結果: " + result);
        } else {
            System.out.println("検索する文字列が見つかりませんでした。");
        }

        scanner.close();
    }
}
