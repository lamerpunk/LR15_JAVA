import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Вспомогательные классы для Задания 3
class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("--- ОТЧЕТ О ЗАРПЛАТЕ СОТРУДНИКОВ ---");
        System.out.printf("%-15s | %10s%n", "Фамилия", "Зарплата");
        System.out.println("----------------+-----------");
        for (Employee emp : employees) {
            System.out.printf("%-15s | %10.2f%n", emp.getFullname(), emp.getSalary());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1 (Вариант 4): Верхний регистр ===");
        String text1 = "разработка программного обеспечения";
        System.out.println("Исходная строка: " + text1);
        System.out.println("Результат: " + text1.toUpperCase());

        System.out.println("\n=== ЗАДАНИЕ 2 (Вариант 4): Самое длинное слово ===");
        String sentence = "Разработка и сопровождение кроссплатформенного программного обеспечения";
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Предложение: " + sentence);
        System.out.println("Самое длинное слово: " + longestWord);

        System.out.println("\n=== ЗАДАНИЕ 3: Отчет по зарплатам (форматирование) ===");
        Employee[] staff = {
                new Employee("Иванов", 2500.50),
                new Employee("Смирнов", 3100.75),
                new Employee("Ковалев", 1850.0)
        };
        Report.generateReport(staff);

        System.out.println("\n=== ЗАДАНИЕ 4: Поиск подстрок с 1 или 2 пробелами ===");
        String text4 = "Versions: Java 5, Java  6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java {1,2}\\d+");
        Matcher matcher = pattern.matcher(text4);

        System.out.println("Найденные подстроки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("Найденные подстроки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println("Найденные подстроки:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}