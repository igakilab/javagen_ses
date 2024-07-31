public class WorkB5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 電話番号入力
        // System.out.println("電話番号を入力してください。");
        String phoneNumber = scanner.nextLine();
        String areaCode = getAreaCode(phoneNumber);

        // 結果出力
        if (areaCode.equals("")) {
            System.out.println("市外局番が見つかりませんでした。");
        } else {
            System.out.println("市外局番：" + areaCode);
        }

        scanner.close();
    }

    public static String getAreaCode(String phoneNumber) {
        String[] areaCodes = {"03", "06", "05", "07", "045", "072", "011", "022", "052", "075"};
        for (String code : areaCodes) {
            if (phoneNumber.contains(code)) {
                return code;
            }
        }
        return "";
    }
}