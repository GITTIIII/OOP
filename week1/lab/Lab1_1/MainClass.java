package week1.lab.Lab1_1;
import java.util.Scanner;
import java.lang.Math;
public class MainClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        double x1 = (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
        double x2 = (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
        
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);

        sc.close();
    }
}