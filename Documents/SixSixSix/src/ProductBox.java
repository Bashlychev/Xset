
import java.util.ArrayList;
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
    public void optimizeWeight(double targetWeight) {
        while (getTotalWeight() > targetWeight) {
            int minWeightIndex = 0;
            double minWeight = Double.MAX_VALUE;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).weight < minWeight) {
                    minWeight = products.get(i).weight;
                    minWeightIndex = i;
                }
            }
            removeProduct(minWeightIndex);
        }
    }

    @Override
    public void optimizePrice(double targetPrice) {
        while (getTotalPrice() > targetPrice) {
            int minPriceIndex = 0;
            double minPrice = Double.MAX_VALUE;
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).price < minPrice) {
                    minPrice = products.get(i).price;
                    minPriceIndex = i;
                }
            }
            removeProduct(minPriceIndex);
        }
    }
}