package week1.lab.Lab1_3;
import java.util.Scanner;
public class CalculateDigit1{
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
        float x = (float)(a*d)/(b+c);
        System.out.println("The result of all digits in "+num+" is "+x);
        sc.close();
    }
}