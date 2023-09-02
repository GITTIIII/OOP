package lab6_2_1;

public class Car extends Vehicle{
    private String bodystyle = "";

    public Car(){
    }

    public Car(String brand, String colour, String year, String model, String bodystyle){
        super(brand,colour,year,model);
        this.bodystyle = bodystyle;    
    }

    public String getbodystyle(){
        return bodystyle;
    }

    public void printDetail(){
        System.out.printf("Vehicle: %s\n",getClass().getSimpleName());
        System.out.printf("Manufacturer: %s\n",super.getBrand());
        System.out.printf("Colour: %s\n",super.getColour());
        System.out.printf("Year: %s\n",super.getYear());
        System.out.printf("Model: %s\n",super.getModel());
        System.out.printf("Body Style: %s\n",bodystyle);
    }
}
