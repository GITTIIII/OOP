package week1.lab.Lab1_3;
import java.util.Scanner;
public class CalculateDigit2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a four-digit integer: ");
        int num = sc.nextInt();
        int a = num/1000;
        int b = num/100;
        b = b%10;
        int c = num/10;
        c = c%10;
        int d = num%10;
        double x = (double)(a+c)/(b+d);
        System.out.print("The result of all digits in "+num+" is "+x);
        sc.close();
    }
}