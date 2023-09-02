package week1.lab.Lab1_2;
import java.util.Scanner;
import java.lang.Math;
public class Hypotenuse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = sc.nextFloat();
        System.out.print("Enter b: ");
        float b = sc.nextFloat();
        double c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse c is "+(float)c);
        sc.close();
    }
}