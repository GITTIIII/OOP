package lab9_2;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");
        System.out.println("You have " + calc.getName());
        System.out.print("Enter your equation: ");
        String str = sc.nextLine();    
        findResult(str, calc);
        sc.close();
    }

    public static void findResult(String str , Calculator c){
        String[] sub = str.split(" ");
        double total = 0;
        double n2 = 0;
        String op = "";
        try{
            checkdigit(sub[0]);
            total = Double.valueOf(sub[0]);
            for(int x=1 ; x<sub.length ; x+=2){
                op = sub[x];
                checkdigit(sub[x+1]);
                n2 = Double.valueOf(sub[x+1]);
                switch(op){
                    case "+": 
                        total = c.add(total, n2);
                        break;
                    case "-": 
                        total = c.subtract(total, n2);
                        break;
                    case "*": 
                        total = c.multiply(total, n2);
                        break;
                    case "/": 
                        if(n2==0){
                            throw new ArithmeticException("Division by zero");
                        }
                        total = c.divide(total, n2);
                        break;
                    default:
                        throw new OperatorException(c.getName()+" dose not have the "+op+" operator");
                }
            }
            System.out.println(str+" = "+total);
        }
        catch (Exception e){
            if(e.getClass().getSimpleName().equals("ArithmeticException")){
                System.out.println("Exception occured: "+e.getClass().getName());
            }
            System.out.println(e.getMessage());
        }
    } 

    public static void checkdigit(String s) throws NonDigitException{
        for(char c : s.toCharArray())
        if(Character.isLetter(c)){
            throw new NonDigitException(s+" contains non-digit characters");
        }
    }
}
