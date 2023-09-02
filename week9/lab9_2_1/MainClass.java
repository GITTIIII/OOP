import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");
        System.out.println("You have " + calc.getName());
        System.out.print("Enter your equation: ");
        String str = sc.nextLine();
        findresult(str, calc);
        sc.close();
    }

    public static void findresult(String s, Calculator c){
        String[] se = s.split(" ");
        try{
            if(se.length%2==0){
                throw new EquationException("Incomplete equation");
            }
            checkletter(se[0]);
            checknegative(se[0]);
            double total = Double.parseDouble(se[0]);
            for(int x = 1 ; x<se.length ; x+=2){
                checkletter(se[x+1]);
                checknegative(se[x+1]);
                double n2 = Double.parseDouble(se[x+1]);
                switch(se[x]){
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
                        throw new OperatorException(c.getName()+" dose not have the "+se[x]+" operator");
                }
            }
            System.out.println(s+" = "+total);
        }
        catch (Exception e){
            if(e.getClass().getSimpleName().equals("ArithmeticException")){
                System.out.println("Exception occured: "+e.getClass().getName());
            }
            System.out.println(e.getMessage());
        }
    }

    public static void checknegative(String s) throws NegativeValueException{
        if(Double.parseDouble(s)<0){
            throw new NegativeValueException(s+" is a negative number");
        }
    }
    
    public static void checkletter(String s) throws NonDigitException{
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                throw new NonDigitException(s+" contains non-digit characters");
            }
        }
    }
}