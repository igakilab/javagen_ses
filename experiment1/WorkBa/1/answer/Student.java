class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.printf("名前: %s, 年齢: %d\n", this.name, this.age);
    }
}