public class WorkB3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<String> registrants = new java.util.ArrayList<>();

        System.out.print("登録者数を入力してください: ");
        int numRegistrants = scanner.nextInt();

        for (int i = 0; i < numRegistrants; i++) {
            System.out.printf("登録者%dの名前を入力してください: ", i+1);
            String name = scanner.next();
            registrants.add(name);
        }

        System.out.print("検索したい登録者の名前を入力してください: ");
        String searchName = scanner.next();

        int index = registrants.indexOf(searchName);
        if (index != -1) {
            System.out.printf("%s は登録者%dです。\n", searchName, index+1);
        } else {
            System.out.println("該当する登録者が見つかりませんでした。");
        }

        scanner.close();
    }
}