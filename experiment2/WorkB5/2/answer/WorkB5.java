public class WorkB5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // System.out.println("文章を入力してください。");
        String sentence = scanner.nextLine();

        // System.out.println("検索する単語を入力してください。");
        String targetWord = scanner.nextLine();

        int count = 0;
        int index = 0;
        while (index != -1) {
            index = sentence.indexOf(targetWord, index);
            if (index != -1) {
                count++;
                index += targetWord.length();
            }
        }

        System.out.println("単語 '" + targetWord + "' は文章中に " + count + " 回出現します。");

        scanner.close();
    }
}