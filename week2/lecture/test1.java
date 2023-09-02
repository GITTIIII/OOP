package week2.lecture;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();
        if (0<budget ){
            System.out.println("You can buy Keyboard");
            if (501<=budget ){
            System.out.println("You can buy Mouse");
                if (1001<=budget ){
                System.out.println("You can buy Router");
                    if (2001<=budget){
                    System.out.println("You can buy Monitor");
                        if (10000<budget){
                        System.out.println("You can buy Graphic Card");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
