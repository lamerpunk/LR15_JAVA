public abstract class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void work();
    public abstract double calculateBonus();

    public void displayInfo() {
        System.out.printf("Сотрудник: %s | Стаж: %d лет | Оклад: %.2f руб.%n",
                name, experience, salary);
    }
}