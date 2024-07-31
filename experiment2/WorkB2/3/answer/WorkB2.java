public class WorkB2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.ArrayList<java.util.ArrayList<Object>> profiles = new java.util.ArrayList<>();

        // ユーザーのプロフィールデータを管理する
        while (true) {
            System.out.print("1: プロフィール追加 / 2: 検索 / 3: 終了 > ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                java.util.ArrayList<Object> profile = new java.util.ArrayList<>();
                System.out.print("名前を入力してください: ");
                profile.add(scanner.next());
                System.out.print("年齢を入力してください: ");
                profile.add(scanner.nextInt());
                profiles.add(profile);
            } else if (input == 2) {
                System.out.print("検索する名前を入力してください: ");
                String searchName = scanner.next();
                boolean found = false;

                for (java.util.ArrayList<Object> profile : profiles) {
                    if (profile.get(0).equals(searchName)) {
                        System.out.printf("名前: %s, 年齢: %d%n", profile.get(0), profile.get(1));
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("該当するプロフィールは見つかりませんでした。");
                }
            } else if (input == 3) {
                break;
            }
        }

        scanner.close();
    }
}