package week4.lab.Lab4_3;
import java.util.Scanner;
public class DrawingShape{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter option:");
        String s = sc.nextLine();
        int num = 0;
        switch(s){
            case "A":
            System.out.print("Input size: ");
            num = sc.nextInt();
            for(int x = 0 ; x < num ; x++ ){
                for(int y = 0 ; y< num ; y++){
                    System.out.print("0 ");
                }
                System.out.print("\n");
            }
            break;

            case "B":
            System.out.print("Input size: ");
            num = sc.nextInt();
            for(int x = 0 ; x < num ; x++ ){
                for(int y = 0 ; y< num ; y++){
                    if(y<num-x-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("0 ");
                    }

                }
                System.out.print("\n");
            }
            break;
            
            case "C":
            System.out.print("Input width size: ");
            num = sc.nextInt();
            System.out.print("Input length size: ");
            int num1 = sc.nextInt();
            for(int x = 0 ; x < num ; x++ ){
                for(int y = 0 ; y< num1 ; y++){
                    System.out.print("0 ");
                }
                System.out.print("\n");
            }
            break;
            default :
            System.out.print("Invalid option!");
            break;
        }
        sc.close();
    }
}