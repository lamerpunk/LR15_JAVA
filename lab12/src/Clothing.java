public class Clothing extends Product {
    private String size;

    public Clothing(String name, int id, double price, String size) {
        super(name, id, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Размер: " + size;
    }
}