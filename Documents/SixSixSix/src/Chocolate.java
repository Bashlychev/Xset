class Chocolate extends Product {
    private String taste;

    public Chocolate(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    @Override
    public String getUniqueParameter() {
        return "Тип: " + taste;
    }
}