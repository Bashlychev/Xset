
abstract class Product {
    protected String name;
    protected double weight;
    protected double price;

    public Product(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    // Метод для получения уникального параметра продукта
    public abstract String getUniqueParameter();
}