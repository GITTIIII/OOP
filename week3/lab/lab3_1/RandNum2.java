package week3.lab.lab3_1;
import java.util.Scanner;
import java.util.Random;
public class RandNum2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int arr[]  = new int[10];
        int min = 10, max = 40;

        for (int x = 0 ; x<arr.length ; x++ ){
            arr[x] = rand.nextInt(max-min+1)+min;
        }

        System.out.println("The array is");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println("\nThe numbers, where the last digit is greater than or equal to five, are");
        for (int x : arr){
            if (x%10>=5){
                System.out.print(x+" ");
            }
        }
        sc.close();
    }
}