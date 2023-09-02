package week2.lab.Lab2_2;
import java.util.Scanner;
public class NumberChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        float num = sc.nextFloat();
        if (num>0){
            System.out.print("บวก ");
            if(num-(int)num==0){
                System.out.print("จำนวนเต็ม ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }else{
                System.out.print("จำนวนจริง ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }
        }
        else if (num<0){
            System.out.print("ลบ ");
            if(num-(int)num==0){
                System.out.print("จำนวนเต็ม ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }else{
                System.out.print("จำนวนจริง ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }
        }
        else{
            if(num-(int)num==0){
                System.out.print("จำนวนเต็ม ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }else{
                System.out.print("จำนวนจริง ");
                if((int)num%2!=0){
                    System.out.print("เลขคี่");
                }
                else{
                    System.out.print("เลขคู่");
                }
            }
        }
        sc.close();
    }
}