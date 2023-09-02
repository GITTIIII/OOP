package week1.lab.Lab1_2;
import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float n = sc.nextFloat();
        System.out.print(n+" is the ");
        if(n>0){
            System.out.print("positive ");
        }
        else if(n<0){
            System.out.print("negative ");
        }
        if((int)n%2==0){
            System.out.print("even ");
        }
        else{
            System.out.print("odd ");
        }
        if((int)n-n==0){
            System.out.print("integer number");
        }
        else{
            System.out.print("real number");
        }
        sc.close();
    }
}
