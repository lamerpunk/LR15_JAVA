public class Main {
    public static void main(String[] args) {

        Employee[] staff = new Employee[5];
        staff[0] = new Manager("Алексей Смирнов", 4200.0, 7, 12);
        staff[1] = new Manager("Ольга Васильева", 3800.0, 5, 8);
        staff[2] = new Developer("Глеб Богданов", 3100.0, 3, "Java");
        staff[3] = new Developer("Дмитрий Козлов", 2600.0, 2, "C#");
        staff[4] = new Developer("Екатерина Новикова", 3500.0, 4, "Kotlin");

        System.out.println("================ СПИСОК СОТРУДНИКОВ И РАСЧЕТ БОНУСОВ ================\n");

        for (int i = 0; i < staff.length; i++) {
            System.out.println("[Запись #" + (i + 1) + "]");
            staff[i].displayInfo();
            staff[i].work();
            System.out.printf("Рассчитанный бонус: %.2f руб.%n", staff[i].calculateBonus());
            System.out.println("------------------------------------------------------------------");
        }
    }
}