package week4.lab.Lab4_2;
import java.util.Scanner;
public class MyMaxScore_peter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of subjects:");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("You are not enrolled in any courses.");
        }
        else{
            String[] sub = new String[n];
            int[] score = new int[n];
            inputSubject(sub,new Scanner(System.in));
            inputScore(score,new Scanner(System.in));
        }
        sc.close();
        
    }
    static void  inputSubject(String[] sub,Scanner sc){
        for(int x = 0 ; x<sub.length ; x++){
            System.out.print("Input subject: ");
            sub[x] = sc.nextLine();
        }
    }
    static void inputScore(int[] score,Scanner sc){
        for(int x = 0 ; x<score.length ; x++){
            System.out.print("Input score: ");
            score[x] = sc.nextInt();
        }
    }
}