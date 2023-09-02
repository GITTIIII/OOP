package lab7_2;

public class BasicCalculator extends Calculator {
    public BasicCalculator(){
    }

    public BasicCalculator(String name){
        super(name);
    }

    public void add(double n1, double n2){
        setType("Add");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.2f + %.2f = %.2f\n",n1,n2,(n1+n2));
    }
    
    public void subtract(double n1, double n2){
        setType("Subtract");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.2f - %.2f = %.2f\n",n1,n2,(n1-n2));
    }
    
    public void multiply(double n1, double n2){
        setType("Mutiply");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.2f * %.2f = %.2f\n",n1,n2,(n1*n2));
    }
    
    public void divide(double n1, double n2){
        setType("Divide");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.2f / %.2f = %.2f\n",n1,n2,(n1/n2));
    }
}
