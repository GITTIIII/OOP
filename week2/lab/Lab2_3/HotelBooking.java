package week2.lab.Lab2_3;
import java.util.Scanner;
public class HotelBooking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int ROOM = 5000;
        final int ROOM1 = 10000;
        final int FOOD = 500;
        final int JONG = 1000;
        final double VAT = 1.8/100;
        float total = 0;

        System.out.println("Do you want to book a room?");
        String a = sc.next();
        if (a.equals("yes")){
            System.out.println("Please choose a room type:");
            String b = sc.next();
            if(b.equals("extra")){
                total += ROOM1;
            }
            else{
                total += ROOM;
            }
            System.out.println("How many rooms?");
            int c = sc.nextInt();
            total *= c;
            System.out.println("Include breakfast?");
            String d = sc.next();
            if(d.equals("yes")){
                total += FOOD;
                total = (float)(total*VAT)+total;
                System.out.print("You need to pay "+total+" baht (included service charge).");
            }
            else{
                total = (float)(total*VAT)+total;
                System.out.print("You need to pay "+total+" baht (included service charge).");
            }
        }
        else{
            System.out.println("Do you want to reserve your quota for booking room next time?");
            String b = sc.next();
            if(b.equals("yes")){
                total += JONG;
                total = (float)(total*VAT)+total;
                System.out.print("You need to pay "+total+" baht (included service charge).");
            }
            else{
                System.out.print("You need to pay "+total+" baht (included service charge).");
            }
        }
        sc.close();
    }
}