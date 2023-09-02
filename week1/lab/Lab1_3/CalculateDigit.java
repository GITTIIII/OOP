package week1.lab.Lab1_3;
import java.util.Scanner;
public class CalculateDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a four=digit integer: ");
        int num = sc.nextInt();
        int num1 = num;
        int sum = 0;
        while(num>0){
            sum += num%10;
            num/=10;  
        }
        System.out.println("The sum of all digits in "+num1+" is "+sum);
        sc.close();
    }
}