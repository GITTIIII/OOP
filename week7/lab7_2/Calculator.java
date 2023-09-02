package lab7_2;

public class Calculator implements Operator {
    private String name;
    private String type;

    public Calculator(){
    }

    public Calculator(String name){
        this.name = name;
        System.out.printf("You have got a %s [%s]\n",this.name,getClass().getSimpleName());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void add(double n1, double n2){
        
    }

    public void subtract(double n1, double n2){
        
    }

    public void multiply(double n1, double n2){
        
    }

    public void divide(double n1, double n2){
        
    }
}
