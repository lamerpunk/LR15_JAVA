public class Electronics extends Product {
    private int warranty;

    public Electronics(String name, int id, double price, int warranty) {
        super(name, id, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return super.toString() + ", Гарантия: " + warranty + " мес.";
    }
}