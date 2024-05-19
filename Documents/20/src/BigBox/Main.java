package BigBox;

public class Main {
    public static void main(String[] args) {
        GiftBox box = new GiftBox();
        box.addSweet(new Chocolate("Nestle", 100, 150, "Молочный"));
        box.addSweet(new Chocolate("Alpen Gold", 90, 100, "Белый"));
        box.addSweet(new Chocolate("Snikers", 90, 90, "2 v 1"));
        box.addSweet(new Cookie("Яшкино", 120, 60, "Глазурь"));
        box.addSweet(new Cookie("Яшкино", 140, 60, "Вишня"));
        box.addSweet(new Cookie("Яшкино", 120, 60, "Американо"));
        box.addSweet(new Cookie("Юбилейное", 100, 90, "Топленое"));
        box.addSweet(new Cookie("Юбилейное", 95, 100, "Молочное"));
        box.addSweet(new Cookie("Юбилейное", 105, 110, "Орех"));
        box.addSweet(new Marshmallow("Харибо", 30, 100, "Маленький"));
        box.addSweet(new Marshmallow("Харибо", 45, 150, "Средний"));
        box.addSweet(new Marshmallow("Харибо", 60, 200, "Большой"));

        System.out.println("Общий вес коробки со сладостями: " + box.getTotalWeight() + " г");
        System.out.println("Общая стоимость коробки со сладостями: " + box.getTotalPrice() + " руб");

        System.out.println("Информация о всех сладостях в коробке:");
        box.displayAllSweets();

        box.optimizeWeight(1200); // maxWeight - лимит по весу подарка
        System.out.println("После оптимизации по весу:");
        box.displayAllSweets();
        System.out.println("Вес подарочка: " + box.getTotalWeight() + " г");

        box.optimizePrice(1000); // maxPrice - лимит по цене
        System.out.println("После оптимизации по цене:");
        box.displayAllSweets();
        System.out.println("Сумма подарочка: " + box.getTotalPrice() + " руб");
    }
}
