public class WorkB5 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // ログイン情報入力
    System.out.print("ユーザー名を入力してください: ");
    String username = scanner.nextLine();

    System.out.print("パスワードを入力してください: ");
    String password = scanner.nextLine();

    // ログイン情報検証
    if (username.equals("admin") && password.equals("Password123")) {
      System.out.println("ログインに成功しました。");
    } else {
      System.out.println("ログインに失敗しました。ユーザー名またはパスワードが正しくありません。");
    }

    scanner.close();
  }
}