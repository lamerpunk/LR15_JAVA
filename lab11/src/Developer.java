public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15;
    }

    public void work(String task, boolean isUrgent) {
        if (isUrgent) {
            System.out.println(getName() + " срочно пишет код для задачи: " + task);
        } else {
            System.out.println(getName() + " пишет код для задачи: " + task);
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Должность: Разработчик | Язык: " + language);
    }
}