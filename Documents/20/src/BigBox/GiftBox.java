package BigBox;

import java.util.ArrayList;
import java.util.List;

public class GiftBox implements Box {
    private List<Sweet> sweets;

    public GiftBox() {
        sweets = new ArrayList<>();
    }

    @Override
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void removeSweet(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        }
    }

    @Override
    public void removeLastSweet() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        }
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Sweet sweet : sweets) {
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void displayAllSweets() {
        for (Sweet sweet : sweets) {
            System.out.println(sweet);
        }
    }

    @Override
    public void optimizeWeight(double maxWeight) {
        while (getTotalWeight() > maxWeight) {
            double minWeight = Double.MAX_VALUE;
            int indexToRemove = -1;
            for (int i = 0; i < sweets.size(); i++) {
//                Sweet sweet = sweets.get(i);
                if (sweets.get(i).getWeight() < minWeight) {
                    minWeight = sweets.get(i).getWeight();
                    indexToRemove = i;
                }
            }
            if (indexToRemove != -1) {
                sweets.remove(indexToRemove);
            } else {
                break; // Если не удалось найти сладость с меньшим весом, выходим из цикла
            }
        }
    }

    @Override
    public void optimizePrice(double maxPrice) {
        while (getTotalPrice() > maxPrice) {
            double minPrice = Double.MAX_VALUE;
            int indexToRemove = -1;
            for (int i = 0; i < sweets.size(); i++) {
//                Sweet sweet = sweets.get(i);
                if (sweets.get(i).getPrice() < minPrice) {
                    minPrice = sweets.get(i).getPrice();
                    indexToRemove = i;
                }
            }
            if (indexToRemove != -1) {
                sweets.remove(indexToRemove);
            } else {
                break; // Если не удалось найти сладость с меньшей ценой, выходим из цикла
            }
        }
    }
}
