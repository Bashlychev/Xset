class Cookie extends Product {
    private String type;

    public Cookie(String name, double weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    @Override
    public String getUniqueParameter() {
        return "Вкус: " + type;
    }
}