package week3.lab.lab3_1;
import java.util.Random;
import java.util.Scanner;
public class RandNum1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] arr1 = new int[10];
        int min = 10, max = 50;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(max-min+1)+min;
        }

        System.out.println("The array is ");
        for (int a : arr1) {
            System.out.print(a + " ");
        }

        System.out.println("\nThe numbers, where the last digit" +" is greater than five, are ");
        for (int a : arr1) {
            int num = a%10;
            if (num >= 5) {
                System.out.print(a + " ");
            }
        }
        sc.close();
    }
}