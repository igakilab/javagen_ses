class ItemB9 {
    private String name;
    private int stock;

    public ItemB9(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }

    @Override
    public String toString() {
        return String.format("%s - 在庫: %d個", this.name, this.stock);
    }
}