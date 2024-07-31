class Store {
    private String storeName;
    private String itemName;
    private int stock;

    Store(String storeName, String itemName, int stock) {
        this.storeName = storeName;
        this.itemName = itemName;
        this.stock = stock;
    }

    String getStoreName() {
        return this.storeName;
    }

    String getItemName() {
        return this.itemName;
    }

    int getStock() {
        return this.stock;
    }

    void updateStock(int quantity) {
        this.stock += quantity;
    }
}