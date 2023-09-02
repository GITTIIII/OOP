package week2.lecture;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int LIMIT = 15000;
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();
        if(budget>LIMIT){
            System.out.println("you can buy it");
        }
        else{
            System.out.println("you can not buy it");
        }
        sc.close();
    }
}
