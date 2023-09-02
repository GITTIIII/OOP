package week2.lab.Lab2_2;
import java.util.*;
import java.text.DecimalFormat;
public class StudentsScore {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat dsd = new DecimalFormat("#.####");
        DecimalFormat dmean = new DecimalFormat("0.00");
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        double sum = 0;
        for(int x = 0 ; x<size ; x++){
            while(true){
                System.out.print("Enter student "+(x+1)+" score: ");
                int n = sc.nextInt();
                if(n>=0 && n<=100){
                    arr[x] = n;
                    sum += n;
                    break;
                }
                else{
                    System.out.println("Please enter the score 0-100");
                }
            }
        }
        System.out.println("\n======== Summary ========");
        System.out.println(Arrays.toString(arr));
        System.out.println("Summation: "+sum);
        double mean = sum/size;
        System.out.println("Mean: "+dmean.format(mean));
        double sd = 0; 
        for(int x : arr){
            sd += Math.pow(x-mean,2);
        }
        sd = Math.sqrt(sd/size);
        System.out.println("SD: "+dsd.format(sd));
        sc.close();
    }
}
