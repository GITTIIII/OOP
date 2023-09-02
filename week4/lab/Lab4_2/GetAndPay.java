package week4.lab.Lab4_2;
import java.util.Scanner;
public class GetAndPay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = 1000;
        int in = 0;
        int out = 0;
        String l = "";
        while(true){
            System.out.print("Option: ");
            String x = sc.nextLine();
            if(x.equals("+")){
                System.out.print("List: ");
                l = sc.nextLine();
                System.out.print("Amount of money: ");
                int n = sc.nextInt();
                in += n;
                money += n;
                sc.nextLine();
            }
            else if(x.equals("-")){
                System.out.print("List: ");
                l = sc.nextLine();
                System.out.print("Amount of money: ");
                int n = sc.nextInt();
                out += n;
                money -= n;
                sc.nextLine();
            }
            else if(x.equals("0")){
                break;
            }
            else{
                System.out.println("Invalid option!");
            }
        }
        summary(in,out,money);
        System.out.print(l);
        sc.close();
    }
    static void summary(int a,int b,int c){
        System.out.println("Ammount of income: "+(float)a);
        System.out.println("Ammount of expense: "+(float)b);
        System.out.println("Remaining balance: "+(float)c+" Bath");
    }
}