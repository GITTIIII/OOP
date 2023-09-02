package lab9_2_1chorlee;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");
        System.out.println("You have " + calc.getName());
        System.out.print("Enter your equation: ");
        String str = sc.nextLine();
        calculateEquation(calc,str);
        sc.close();
    }

    static void calculateEquation(Calculator calc, String equation){
        String arrEqn[] = equation.split(" "); 
        try {
            if (arrEqn.length % 2 == 0 ) {
                throw new EquationException("Incomplete equation");
            }else{
                checkDigit(arrEqn[0]);
                double total = Double.parseDouble(arrEqn[0]);
                checkNeg(total);
                for (int i = 1; i < arrEqn.length; i+=2) {
                    String op = arrEqn[i];
                    double n1 = total;
                    checkDigit(arrEqn[i+1]);
                    double n2 = Double.parseDouble(arrEqn[i+1]);
                    checkNeg(n2);
                    switch (op) {
                        case "+":
                            total = calc.add(n1, n2);
                            break;
                        case "-":
                            total = calc.subtract(n1, n2);
                            break;
                        case "*":
                            total = calc.multiply(n1, n2);
                            break;
                        case "/":
                            if (n2 == 0) {
                                throw new ArithmeticException("Exception occured: java.lang.ArithmeticException\nDivision by zero");
                            }
                            total = calc.divide(n1, n2);
                            break;
                        default:
                            throw new OperatorException(calc.getName() + " dose not have the "+op+" operator");
                    }
                }
                String strEqn = Arrays.toString(arrEqn).replace(", ", " ").replace("]", "").replace("[", "");
                System.out.println(strEqn+" = "+total);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkDigit(String n) throws NonDigitException{
        for (char c : n.toCharArray()) {
            if (Character.isLetter(c)) {
                throw new NonDigitException(n+" contains non-digit characters");
            }
        }
    }
    static void checkNeg(double d) throws NegativeValueException{
        if (d < 0){
            throw new NegativeValueException(d+" is a negative number");
        }
    }

}
