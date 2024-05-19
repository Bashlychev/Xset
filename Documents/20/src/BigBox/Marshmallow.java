package BigBox;

public class Marshmallow extends Sweet {
    private String size;

    public Marshmallow (String name, double weight, double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getType() {
        return size;
    }

    @Override
    public String getUniqueParameter() {
        return "Тип: " + size;
    }
}