class Item {
    private String name;
    private int price;

    public Item(String name) {
        this.name = name;
        // 商品名によって価格を設定
        if (name.equals("apple")) {
            this.price = 100;
        } else if (name.equals("banana")) {
            this.price = 80;
        } else {
            this.price = 50;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}