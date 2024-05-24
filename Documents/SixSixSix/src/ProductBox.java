
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ProductBox implements BoxInterface {
    private List<Product> products;

    public ProductBox() {
        products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(int index) {
        products.remove(index);
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Product product : products) {
            totalWeight += product.weight;
        }
        return totalWeight;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price;
        }
        return totalPrice;
    }

    @Override
    public void displayAllProducts() {
        for (Product product : products) {
            System.out.println("Название: " + product.name + ", Вес: " + product.weight +
                    " г, Цена: " + product.price + " руб, " + product.getUniqueParameter());
        }
    }
    @Override
    public void optimizeWeight(double maxWeight) {
        products.sort(Comparator.comparingDouble(s -> s.weight));
        while (getTotalWeight() > maxWeight && !products.isEmpty()) {
            products.remove(0);
        }
    }
    @Override
    public void optimizePrice(double maxWeight) {
        products.sort(Comparator.comparingDouble(s -> s.price));
        while (getTotalWeight() > maxWeight && !products.isEmpty()) {
            products.remove(0);
        }
    }
}