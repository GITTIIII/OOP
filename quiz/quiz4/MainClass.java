package quiz4;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sid: ");
        String sid = sc.nextLine();
        int countletter = 0;
        int countdigit = 0;
        for(char c : sid.toCharArray()){
            if(Character.isLetter(c)){
                countletter += 1;
            }
            else if(Character.isDigit(c)){
                countdigit += 1;
            }
        }
        if(countdigit > 0 && countletter >0 && sid.length()==8 && Character.isLetter(sid.charAt(0))){
            System.out.println("name");
            System.out.println();
        }
        sc.close();
    }
}
