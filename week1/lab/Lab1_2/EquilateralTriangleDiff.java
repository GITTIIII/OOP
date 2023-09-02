package week1.lab.Lab1_2;
import java.util.Scanner;
import java.lang.Math;
public class EquilateralTriangleDiff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a1 : ");
        int a1 = sc.nextInt();
        System.out.print("a2 : ");
        int a2 = sc.nextInt();
        double area = ((Math.sqrt(3)/4)*(a1*a1))-((Math.sqrt(3)/4)*(a2*a2));
        System.out.println("The area is "+(float)area);
        sc.close();
    }
}