public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("Красный", 0.0, 0.0, 5.0);
        shapes[1] = new Circle("Синий", 2.5, 4.0, 3.2);
        shapes[2] = new Circle("Зеленый", -1.0, 3.0, 7.5);
        shapes[3] = new Rectangle("Желтый", 10.0, 5.0, 4.0, 4.0);
        shapes[4] = new Rectangle("Черный", -3.0, -2.0, 6.0, 8.0);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\n[Фигура #" + (i + 1) + "]");
            shapes[i].displayInfo();
            shapes[i].draw();

            if (shapes[i] instanceof Circle) {
                Circle circle = (Circle) shapes[i];
                System.out.printf("Диаметр круга: %.2f%n", circle.getDiameter());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapes[i];
                System.out.println("Является квадратом: " + (rectangle.isSquare() ? "Да" : "Нет"));
            }
        }
    }
}