class ShopB6 {
    private String product;
    private int stock;
    private int price;

    public ShopB6(String product, int stock, int price) {
        this.product = product;
        this.stock = stock;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public int getStock() {
        return stock;
    }

    public void decreaseStock(int amount) {
        stock -= amount;
    }

    public void increaseStock(int amount) {
        stock += amount;
    }

    public void displayInfo() {
        System.out.printf("商品名: %s, 在庫数: %d, 価格: %d\n", product, stock, price);
    }
}