package week2.lecture;
import java.util.Scanner;
public class test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter operater: ");
        char ope = sc.next().charAt(0);

        switch(ope){
            case '+':
                System.out.println(n1+n2);
                break;
            case'-':
                System.out.println(n1-n2);
                break;
            case'*':
                System.out.println(n1*n2);
                break;
            case'/':
                System.out.println((n1/(double)n2));
                break;
            default:
                System.out.println("Bruh");
                break;
        }
        sc.close();
    }
}