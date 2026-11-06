public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Ольга", 2500.0, 2);
        emp.work();
        emp.work(8);
        emp.work("Аудит");

        Manager mgr = new Manager("Алексей", 4500.0, 7, 10);
        mgr.work("Портал", 5);

        Developer dev = new Developer("Глеб", 3600.0, 4, "Java");
        dev.work("Авторизация", true);

        System.out.println();

        Employee[] staff = new Employee[] {
                new Employee("Иван", 1800.0, 1),
                new Manager("Дмитрий", 4800.0, 8, 15),
                new Developer("Екатерина", 3400.0, 3, "Kotlin"),
                new Developer("Максим", 3900.0, 5, "C#")
        };

        for (Employee e : staff) {
            e.displayInfo();
            System.out.printf("Бонус: %.2f%n", e.calculateBonus());

            if (e instanceof Manager) {
                Manager m = (Manager) e;
                System.out.println("Размер команды: " + m.getTeamSize());
            } else if (e instanceof Developer) {
                Developer d = (Developer) e;
                System.out.println("Язык стека: " + d.getLanguage());
            }
            System.out.println("----------------------------------------");
        }
    }
}