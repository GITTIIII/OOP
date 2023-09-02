package week2.lecture;
import java.util.Scanner;
import java.lang.Math;
public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double root = Math.sqrt(num);
        double root3 = Math.cbrt(num);
        if (num>0){
            if ((int)root-root==0){
                System.out.println(root);
            }
            else if ((int)root3-root3==0){
                System.out.println(root3);
            }
        }
        sc.close();
    }
}
