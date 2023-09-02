package lab9_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num1, num2;
            int[] arr1 = {20, 40, 45, 60, 75, 90};
            int[] arr2 = {1, 2, 0, 5, 3};
            
            System.out.print("Enter num1: ");
            num1 = sc.nextInt();
            
            System.out.print("Enter num2: ");
            num2 = sc.nextInt();
            
            System.out.println(arr1[num1] + " / " + arr2[num2] + " = " +arr1[num1] / arr2[num2]); 
        } 
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception occured: "+ex);
            System.out.println("The number you entered exceeds the size of the array.");
        }
        catch (ArithmeticException ex){
            System.out.println("Exception occured: "+ex);
            System.out.println("Division by zero is not allowed.");
        }
        catch (InputMismatchException ex){
            System.out.println("Exception occured: "+ex);
            System.out.println("The index must be an integer.");
        }
        sc.close();
    }
}