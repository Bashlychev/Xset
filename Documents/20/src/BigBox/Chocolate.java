package BigBox;

public class Chocolate extends Sweet {
    private String taste;

    public Chocolate(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getType() {
        return taste;
    }

    @Override
    public String getUniqueParameter() {
        return "Тип: " + taste;
    }
}