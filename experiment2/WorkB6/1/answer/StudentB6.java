class StudentB6 {
    private String name;
    private int score;

    public StudentB6(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "生徒名: " + name + ", 成績: " + score;
    }
}