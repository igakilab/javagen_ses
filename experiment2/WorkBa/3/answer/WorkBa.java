import java.util.ArrayList;
import java.util.Scanner;

public class WorkBa {
    public static void main(String[] args) {
        ArrayList<Book> inventory = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        // 書籍情報を登録
        System.out.println("書籍情報を登録します。");
        System.out.print("書籍のタイトルを入力してください: ");
        String title = sc.next();
        System.out.print("書籍の著者を入力してください: ");
        String author = sc.next();
        System.out.print("書籍の価格を入力してください: ");
        int price = sc.nextInt();

        Book newBook = new Book(title, author, price);
        inventory.add(newBook);

        // 在庫リストを表示
        System.out.println("\n在庫リスト:");
        for (Book book : inventory) {
            System.out.println(book);
        }

        sc.close();
    }
}