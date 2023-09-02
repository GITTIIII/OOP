package week3.lab.Lab3_3;
import java.util.Scanner;

public class BigAsterisk{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[][];
        int n;
        while(true){ 
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if(n%2!=0){
                arr = new String[n][n];
                break;
            }
        }
        for (int x = 0 ; x<arr.length ; x++){
            for (int y = 0 ; y<arr.length ; y++){
                if (x==y || x==n/2 || y==n/2|| y==n-x-1){
                    arr[x][y]="* ";
                }
                else{
                    arr[x][y]="  ";
                }
            }
        }
        for (int x = 0 ; x<arr.length ; x++){
            for (int y = 0 ; y<arr.length ; y++){
                System.out.print(arr[x][y]);
            }
            System.out.print("\n");
        }
        sc.close();
    }
}