class Person {
    private String name;
    private int age;

    // Personのコンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // nameのgetterメソッド
    public String getName() {
        return this.name;
    }

    // ageのgetterメソッド
    public int getAge() {
        return this.age;
    }
}