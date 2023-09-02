package week3.lab.Lab3_2;
import java.util.Scanner;
public class AverageScore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        int s[] = new int[num];
        float sum = 0;
        for (int x = 0 ; x<s.length ; x++){
            while(true){
                System.out.print("Enter student score: ");
                int n = sc.nextInt();
                if (n>=0 && n<=100){
                    s[x] = n;
                    break;
                }
                else{
                    System.out.println("Please enter the score 0-100");
                }
            }
        }
        for (int avg : s){
            sum+=avg;
        }
        System.out.print("The average score is "+(float)sum/s.length);
        sc.close();
    }
}

