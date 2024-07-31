class StudentBa {
    private String name;

    // StudentBaクラスのコンストラクタを追加
    // 引数nameを受け取り、その値をnameフィールドに格納する
    StudentBa(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // クラスAかクラスBかを判定するメソッドisClassAを追加
    // nameフィールドが'a'から 'm'の範囲に含まれていたらtrue、そうでなければfalseを返す
    public boolean isClassA() {
        char initial = this.name.toLowerCase().charAt(0);
        return initial >= 'a' && initial <= 'm';
    }
}