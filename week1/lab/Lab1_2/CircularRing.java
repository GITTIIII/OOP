package week1.lab.Lab1_2;
import java.util.Scanner;
import java.lang.Math;
public class CircularRing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("r1 : ");
        int r1 = sc.nextInt();
        System.out.print("r2 : ");
        int r2 = sc.nextInt();
        double area = (Math.PI*r1*r1)-(Math.PI*r2*r2);
        System.out.println("The area is "+area);
        sc.close();
    }
}