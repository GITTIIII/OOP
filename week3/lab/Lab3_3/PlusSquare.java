package week3.lab.Lab3_3;
import java.util.Scanner;
public class PlusSquare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            System.out.println("Enter a number:");
            n = sc.nextInt();
            if (n%2!=0){
                break;
            }
        }
        int arr[][] = new int[n][n];
        for (int x = 0 ; x<arr.length ; x++){
            for (int y = 0 ; y<arr.length  ; y++){
                if (x==0 || x==n-1 || y==0 || y==n-1 || y==n/2 || x==n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        sc.close();
    }
}