package BigBox;

public abstract class Sweet {
    private String name;
    private String uniqueParameter;
    private double weight;
    private double price;


    public Sweet(String name, double weight, double price) {
        this.name = name;
        this.uniqueParameter = uniqueParameter;
        this.weight = weight;
        this.price = price;
    }

    public String getName() { return name; }

    public String getUniqueParameter() { return uniqueParameter; }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (Вес: " + weight + "г, Цена: " + price + "руб, " + getUniqueParameter() + ")";
    }
}