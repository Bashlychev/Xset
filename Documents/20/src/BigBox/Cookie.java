package BigBox;

public class Cookie extends Sweet {
    private String type;

    public Cookie(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getFlavor() {
        return type;
    }

    @Override
    public String getUniqueParameter() {
        return "Вкус: " + type;
    }
}