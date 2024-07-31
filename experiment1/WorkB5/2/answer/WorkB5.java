public class WorkB5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // System.out.print("テキストを入力してください: ");
        String text = scanner.nextLine();

        // System.out.print("キーワードを入力してください: ");
        String keyword = scanner.nextLine();

        // キーワードを含む部分の抽出
        int index = text.indexOf(keyword);
        if (index != -1) {
            String extractedText = text.substring(index, index + keyword.length());
            System.out.println("キーワードを含む部分: " + extractedText);
        } else {
            System.out.println("キーワードが見つかりませんでした。");
        }

        scanner.close();
    }
}