package lab7_2;

public class MainClass {
    public static void main(String[] args) {
        Calculator c1 = new BasicCalculator("Casio MS-80B");
        Calculator c2 = new ScientificCalculator("Casio FX-991ES Plus");
        
        add(c1, 45.23, 21.33);
        subtract(c1, 17.32, 39.0);
        multiply(c1, 12.45, 10.62);
        multiply(c2, 12.45, 10.62);
        divide(c1, 354, 7);
        divide(c2, 354, 7);
    }
    public static void add(Operator c, double n1, double n2) {
        c.add(n1, n2);
    }

    public static void subtract(Operator c, double n1, double n2) {
        c.subtract(n1, n2);
    }

    public static void multiply(Operator c, double n1, double n2) {
        c.multiply(n1, n2);
    }
    
    public static void divide(Operator c, double n1, double n2) {
        c.divide(n1, n2);
    }
}
