public class Circle extends Shape {
    private double radius;

    public Circle(String color, double x, double y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Уникальный метод
    public double getDiameter() {
        return 2 * radius;
    }
}