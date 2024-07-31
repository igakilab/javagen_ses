public class WorkB5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 1つ目の文字列を入力
        String str1 = scanner.nextLine();
        // 2つ目の文字列を入力
        String str2 = scanner.nextLine();

        // 一致する部分を表示
        int index = -1;

        while (true) {
            index = str1.indexOf(str2, index + 1);
            if (index == -1) {
                break;
            }
            int endIndex = index + str2.length();
            System.out.print(str1.substring(index, endIndex) + " ");
        }

        scanner.close();
    }
}