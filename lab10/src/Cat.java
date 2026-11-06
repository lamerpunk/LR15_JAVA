public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private double speed;
    private boolean hungry;

    public Cat(String name, String color, double speed, boolean hungry) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мурлычет: «Мяу-мяу!»");
    }

    @Override
    public String getSoundType() {
        return "Мяуканье";
    }

    @Override
    public void move() {
        System.out.printf("Кот %s (окрас: %s) крадется со скоростью %.1f км/ч%n", name, color, speed);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        if (hungry) {
            hungry = false;
            System.out.println(name + " съел рыбку и доволен.");
        } else {
            System.out.println(name + " сыт и лениво отворачивается.");
        }
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }
}