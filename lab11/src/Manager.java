public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.2;
    }

    public void work(String project, int teamMembers) {
        System.out.println(getName() + " ведет проект " + project + " с " + teamMembers + " сотрудниками");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Должность: Менеджер | Команда: " + teamSize);
    }
}