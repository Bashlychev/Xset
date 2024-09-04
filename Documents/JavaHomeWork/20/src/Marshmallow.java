class Marshmallow extends Product {
    private String size;

    public Marshmallow (String name, double weight, double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    @Override
    public String getUniqueParameter() {
        return "Тип: " + size;
    }
}