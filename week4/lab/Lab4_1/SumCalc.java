package week4.lab.Lab4_1;

import java.util.Scanner;

public class SumCalc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = sc.nextInt();
        double sum = summation(num);
        System.out.printf("The sum of sequence is %.2f",sum);
        sc.close();
    }
    static double summation(int num){
        double total = 0;
        for (int x = 1 ; x<= num ; x++){
            total = total + 2*((float)1/(3*x));
        }
        return total;
    }
}

