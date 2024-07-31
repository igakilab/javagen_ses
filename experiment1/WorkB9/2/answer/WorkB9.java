import java.util.ArrayList;
import java.util.Scanner;

public class WorkB9 {
    public static void main(String[] args) {
        // 本のリストを格納するArrayListのインスタンスを生成
        ArrayList<Book> library = new ArrayList<>();

        // 本のデータを入力
        Scanner sc = new Scanner(System.in);

        System.out.println("図書館の本の貸出状況を管理します。");
        System.out.println("本の情報を入力してください。");
        while (true) {
            System.out.print("書名を入力してください（終了する場合は\"exit\"を入力）: ");
            String title = sc.nextLine();
            if (title.equals("exit")) {
                break;
            }
            System.out.print("著者名を入力してください: ");
            String author = sc.nextLine();

            // Bookクラスのインスタンスを生成してArrayListに追加
            library.add(new Book(title, author));
        }

        // 入力された本のリストを表示
        System.out.println("図書館に登録されている本は以下の通りです:");
        for (Book book : library) {
            System.out.printf("書名: %s, 著者: %s\n", book.getTitle(), book.getAuthor());
        }

        // Scannerクラスのインスタンスをクローズ
        sc.close();
    }
}