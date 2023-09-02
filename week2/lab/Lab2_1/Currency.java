package week2.lab.Lab2_1;
import java.util.Scanner;
public class Currency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency:");
        String cur = sc.nextLine();
        double total = 0;
        if (cur.equals("KRW")){
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount * 0.028;
        }else if (cur.equals("EUR")){
            System.out.println("How much?");
            float amount = sc.nextFloat();
            total = amount * 37.45;
        }else {
            System.out.println("Please choose the proper currency");
        }
        System.out.println("You earn "+(float)total+" THB");
        sc.close();
    }
}