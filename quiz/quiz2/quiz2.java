package quiz2;
import java.text.DecimalFormat;
public class quiz2{
    public static void main(String[] args){
        DecimalFormat d = new DecimalFormat("#.####");

        double cArea = FindArea(3);
        double sArea = FindArea(3,4);
        double tArea = FindArea(3,4,5);

        System.out.println("Circle Area: "+d.format(cArea));
        System.out.println("Square Area: "+d.format(sArea));
        System.out.println("Triangle Area: "+d.format(tArea));
    }

    public static double FindArea(double r){
        return r*r*Math.PI;
    }

    public static double FindArea(double length, double width){
        return length * width;
    }

    public static double FindArea(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}