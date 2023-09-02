package week2.lab.Lab2_3;
import java.util.Scanner;
public class BigAsterisk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.print("Enter an odd number: ");
            num = sc.nextInt();
            if(num%2!=0){
                break;
            }
        }
        String[][] arr = new String[Math.abs(num)][Math.abs(num)];
        if(num>0){    
            for(int x = 0 ; x<arr.length ; x++){
                for(int y = 0 ; y<arr.length ; y++){
                    if(x==y || y==num/2 || x==num/2 || y==num-x-1){
                        arr[x][y] = "* ";
                    }
                    else{
                        arr[x][y] = "  ";
                    }
                }
            }
        }
        else{
            num = Math.abs(num);
            for(int x = 0 ; x<arr.length ; x++){
                for(int y = 0 ; y<arr.length ; y++){
                    if(x==y || y==num/2 || x==num/2 || y==num-x-1){
                        arr[x][y] = "  ";
                    }
                    else{
                        arr[x][y] = "* ";
                    }
                }
            }
        }
        for(String[] x : arr){
            for(String y : x){
                System.out.print(y);
            }
            System.out.println();
        }
        sc.close();
    }
}
