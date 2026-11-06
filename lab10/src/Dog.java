public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private double speed;
    private boolean hungry;

    public Dog(String name, String breed, double speed, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " громко лает: «Гав-гав!»");
    }

    @Override
    public String getSoundType() {
        return "Лай";
    }

    @Override
    public void move() {
        System.out.printf("Пес %s (%s) бежит со скоростью %.1f км/ч%n", name, breed, speed);
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void feed() {
        if (hungry) {
            hungry = false;
            System.out.println(name + " с аппетитом поел корма.");
        } else {
            System.out.println(name + " не голоден.");
        }
    }

    @Override
    public boolean isHungry() {
        return hungry;
    }
}