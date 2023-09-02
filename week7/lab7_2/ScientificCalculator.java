package lab7_2;

public class ScientificCalculator extends Calculator {
    public ScientificCalculator(){
    }

    public ScientificCalculator(String name){
        super(name);
    }

    public void add(double n1, double n2){
        setType("Add");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.6f + %.6f = %.6f\n",n1,n2,(n1+n2));
    }
    
    public void subtract(double n1, double n2){
        setType("Subtract");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.6f - %.6f = %.6f\n",n1,n2,(n1-n2));
    }
    
    public void multiply(double n1, double n2){
        setType("Mutiply");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.6f * %.6f = %.6f\n",n1,n2,(n1*n2));
    }
    
    public void divide(double n1, double n2){
        setType("Divide");
        System.out.printf("%s: %s Operater\n",super.getName(),super.getType());
        System.out.printf("%.6f / %.6f = %.6f\n",n1,n2,(n1/n2));
    }
}
