public class Shape {
    private String color;
    private double x;
    private double y;

    public Shape(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую базовую фигуру");
    }

    public double calculateArea() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.printf("Цвет: %s | Координаты: (%.1f, %.1f) | Площадь: %.2f%n", color, x, y, calculateArea());
    }
}