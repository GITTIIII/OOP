package week1.lecture;
import java.util.Scanner;
public class test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your weight: ");
        int w = sc.nextInt();
        System.out.print("Enter your height: ");
        float h = sc.nextFloat();
        float bmi = w/(h*h);
        System.out.println("Name: "+name);
        System.out.println("BMI: "+bmi);
        sc.close();
    }
}