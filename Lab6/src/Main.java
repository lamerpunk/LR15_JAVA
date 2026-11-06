class Fraction {
    private int numerator;
    private int denominator;
    private int count;




/*
public int genCount { return count;}

public int setCont { this.count = count; }
 */

public Fraction (int numerator, int denominator, int count) {
    this(numerator, denominator);
    this.count = count;
}



































    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}



public class Main {
    public static void main(String[] args) {
        Fraction frac1 = new Fraction(1, 2);
        Fraction frac2 = new Fraction(3, 4);

        System.out.println("Первая дробь: " + frac1.toString() + " (в десятичном виде: " + frac1.toDecimal() + ")");
        System.out.println("Вторая дробь: " + frac2.toString() + " (в десятичном виде: " + frac2.toDecimal() + ")");
    }

}