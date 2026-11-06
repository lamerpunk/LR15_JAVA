class Product {

    String name;
    double price;
    int quantity;

    static int totalProducts = 0;
    static double totalValue = 0.0;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProducts += quantity;
        totalValue += price * quantity;
    }

    static double getAveragePrice() {
        if (totalProducts == 0) {
            return 0;
        }
        return totalValue / totalProducts;
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Хлеб", 1.5, 10);
        Product p2 = new Product("Молоко", 2.0, 5);
        Product p3 = new Product("Сыр", 15.0, 2);
        Product p4 = new Product("Яблоки", 3.0, 8);

        System.out.println("Средняя цена: " + Product.getAveragePrice());
    }
}