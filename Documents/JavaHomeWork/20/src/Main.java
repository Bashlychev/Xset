public class Main {
    public static void main(String[] args) {

        ProductBox box = new ProductBox();
        box.addProduct(new Chocolate("Nestle", 100, 150, "Молочный"));
        box.addProduct(new Chocolate("Alpen Gold", 90, 100, "Белый"));
        box.addProduct(new Chocolate("Snikers", 90, 90, "2 v 1"));
        box.addProduct(new Cookie("Юбилейное", 100, 90, "Топленое"));
        box.addProduct(new Cookie("Юбилейное", 95, 100, "Молочное"));
        box.addProduct(new Cookie("Юбилейное", 105, 110, "Орех"));
        box.addProduct(new Marshmallow("Харибо", 30, 100, "Маленький"));
        box.addProduct(new Marshmallow("Харибо", 45, 150, "Средний"));
        box.addProduct(new Marshmallow("Харибо", 60, 200, "Большой"));

        System.out.println("Информация о всех сладостях в коробке до оптимизации:");
        box.displayAllProducts();

        System.out.println("Общая стоимость коробки со сладостями: " + box.getTotalPrice() + " руб");
        System.out.println("Общий вес коробки со сладостями: " + box.getTotalWeight() + " г");

        box.optimizePrice(150);
        System.out.println("После оптимизации по цене:");
        box.displayAllProducts();
        System.out.println("Сумма: " + box.getTotalPrice() + " руб");

        box.optimizeWeight(100);
        System.out.println("После оптимизации по весу:");
        box.displayAllProducts();
        System.out.println("Вес: " + box.getTotalWeight() + " г");

    }
}