package week1.lecture;
import java.util.Scanner;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your major: ");
        String major = sc.nextLine();

        System.out.print("Enter your gpa: ");
        float gpa = sc.nextFloat();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        sc.close();
    }
}