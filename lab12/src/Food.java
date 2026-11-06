public class Food extends Product {
    private String expirationDate;

    public Food(String name, int id, double price, String expirationDate) {
        super(name, id, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Годен до: " + expirationDate;
    }
}