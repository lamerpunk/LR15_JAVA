package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello, Глеб!");
        System.out.println("-----------------------------------");


        System.out.println("Задание 1 (Студенты):");
        Student student1 = new Student("Глеб Богданов", 20, "Т-392");
        Student student2 = new Student("Иван Иванов", 19, "Т-392");

        student1.displayInfo();
        student2.displayInfo();
        System.out.println("-----------------------------------");

        System.out.println("Задание 2 (Товары):");
        Product[] products = new Product[5];
        products[0] = new Product("Ноутбук", 3200.0, 1);
        products[1] = new Product("Телефон", 1500.5, 2);
        products[2] = new Product("Наушники", 300.0, 3);
        products[3] = new Product("Мышка", 150.0, 5);
        products[4] = new Product("Клавиатура", 250.0, 2);

        Product maxPriceProduct = products[0];
        double totalCost = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() > maxPriceProduct.getPrice()) {
                maxPriceProduct = products[i];
            }
            totalCost = totalCost + (products[i].getPrice() * products[i].getQuantity());
        }

        System.out.println("Товар с максимальной ценой: " + maxPriceProduct.getName() + " (Цена: " + maxPriceProduct.getPrice() + ")");
        System.out.println("Общая стоимость всех товаров: " + totalCost);
        System.out.println("-----------------------------------");

        System.out.println("Задание 3 (Месяцы и Сезоны):");
        Month[] months = new Month[12];
        months[0] = new Month("Январь", Season.WINTER);
        months[1] = new Month("Февраль", Season.WINTER);
        months[2] = new Month("Март", Season.SPRING);
        months[3] = new Month("Апрель", Season.SPRING);
        months[4] = new Month("Май", Season.SPRING);
        months[5] = new Month("Июнь", Season.SUMMER);
        months[6] = new Month("Июль", Season.SUMMER);
        months[7] = new Month("Август", Season.SUMMER);
        months[8] = new Month("Сентябрь", Season.AUTUMN);
        months[9] = new Month("Октябрь", Season.AUTUMN);
        months[10] = new Month("Ноябрь", Season.AUTUMN);
        months[11] = new Month("Декабрь", Season.WINTER);

        System.out.println("Летние месяцы:");
        for (int i = 0; i < months.length; i++) {
            if (months[i].getSeason() == Season.SUMMER) {
                System.out.println(months[i].getName());
            }
        }
    }
}