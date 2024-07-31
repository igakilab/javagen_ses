class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "タイトル: " + title + ", 著者: " + author + ", 価格: " + price + "円";
    }
}