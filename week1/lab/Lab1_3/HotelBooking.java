package week1.lab.Lab1_3;
import java.util.Scanner;
public class HotelBooking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int ROOM = 5000;
        final int ROOM1 = 7000;
        final int FOOD = 150;
        final int TABLE = 500;
        final double VAT = 0.0175;
        double total = 0;
        double totalwithvat = 0;
        System.out.println("Do you want to book the hotel room(s)?");
        String yn = sc.nextLine();
        if(yn.equals("yes")){
            System.out.println("Please choose a room type:");
            String t = sc.nextLine();
            if(t.equals("extra")){
                total += ROOM1;
            }
            else{
                total += ROOM;
            }
            System.out.println("How many rooms?");
            int nr = sc.nextInt();
            sc.nextLine();
            total *= nr;
            System.out.println("Breakfast included?");
            String fyn = sc.nextLine();
            if(fyn.equals("yes")){
                total += FOOD*nr;
            }
            totalwithvat = total*VAT+total;
            System.out.println("You need to pay "+totalwithvat+" bath (service charge included).");
        }
        else{
            System.out.println("Do you want to reserve the table(s)?");
            String tyn = sc.nextLine();
            if(tyn.equals("yes")){
                total += TABLE;
                System.out.println("How many tables?");
                int nt = sc.nextInt();
                total *= nt;
            }
            totalwithvat = total*VAT+total;
            System.out.println("You need to pay "+totalwithvat+" bath (service charge included).");
        }   
        sc.close();
    }
}
