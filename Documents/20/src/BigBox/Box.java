package BigBox;

public interface Box {
    void addSweet(Sweet sweet);
    void removeSweet(int index);
    double getTotalWeight();
    double getTotalPrice();
    void displayAllSweets();
    void optimizeWeight(double maxWeight);
    void optimizePrice(double maxPrice);
}