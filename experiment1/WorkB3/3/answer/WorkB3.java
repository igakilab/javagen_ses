public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<String> studentNames = new java.util.ArrayList<>();
        
        // System.out.println("学生の名前を入力してください。(終了する場合はexitを入力)");
        String input = scanner.next();

        // 学生情報入力
        while (!input.equals("exit")) {
            studentNames.add(input);
            // System.out.println("学生の名前を入力してください。(終了する場合はexitを入力)");
            input = scanner.next();
        }

        // System.out.println("調べたい学生の名前を入力してください。");
        String searchName = scanner.next();

        int index = studentNames.indexOf(searchName);
        // 学生の検索結果
        if (index != -1) {
            System.out.printf("%s は %d 番目の学生です。\n", searchName, index + 1);
        } else {
            System.out.println("その学生はリストに存在しません。");
        }

        scanner.close();
    }
}