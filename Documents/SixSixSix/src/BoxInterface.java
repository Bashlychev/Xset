interface BoxInterface {
    void addProduct(Product product);
    void removeProduct(int index);
    double getTotalWeight();
    double getTotalPrice();
    void displayAllProducts();
    void optimizeWeight(double targetWeight);
    void optimizePrice(double targetPrice);
}