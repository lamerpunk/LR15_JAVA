import java.util.LinkedHashMap;
import java.util.Map;

public class Task1Main {
    public static void main(String[] args) {
        Map<String, Product> productMap = new LinkedHashMap<>();

        productMap.put("Ноутбук Asus", new Electronics("Ноутбук Asus", 101, 2800.0, 24));
        productMap.put("Смартфон Samsung", new Electronics("Смартфон Samsung", 102, 1950.0, 12));
        productMap.put("Телевизор LG", new Electronics("Телевизор LG", 103, 3100.0, 36));

        productMap.put("Сыр Российский", new Food("Сыр Российский", 201, 14.5, "25.11.2026"));
        productMap.put("Молоко Савушкин", new Food("Молоко Савушкин", 202, 2.3, "10.11.2026"));
        productMap.put("Хлеб Бородинский", new Food("Хлеб Бородинский", 203, 1.8, "05.11.2026"));

        productMap.put("Куртка зимняя", new Clothing("Куртка зимняя", 301, 260.0, "L"));
        productMap.put("Футболка черная", new Clothing("Футболка черная", 302, 45.0, "M"));

        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println("Ключ: [" + entry.getKey() + "] -> Значение: " + entry.getValue());
        }
    }
}