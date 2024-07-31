public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<Integer> commentLengths = new java.util.ArrayList<>();

        // コメントの長さを入力
        // System.out.println("ユーザー数を入力してください:");
        int numUsers = scanner.nextInt();

        // System.out.println("各ユーザーのコメントの文字数をスペース区切りで入力してください:");
        for (int i = 0; i < numUsers; i++) {
            commentLengths.add(scanner.nextInt());
        }

        // 最も長いコメントの文字数を調査
        int maxLength = 0;
        for (int length : commentLengths) {
            maxLength = Math.max(maxLength, length);
        }

        // 最も長いコメントのインデックスを取得
        int longestCommentIndex = commentLengths.indexOf(maxLength);

        System.out.printf("最も長いコメントの文字数: %d%n", maxLength);
        System.out.printf("最も長いコメントを投稿したユーザー番号: %d%n", longestCommentIndex + 1);

        scanner.close();
    }
}