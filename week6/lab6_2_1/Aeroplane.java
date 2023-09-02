package lab6_2_1;

public class Aeroplane extends Vehicle{
    private String propulsion = "";

    public Aeroplane(){
    }

    public Aeroplane(String brand, String colour, String year, String model, String propulsion){
        super(brand,colour,year,model);
        this.propulsion = propulsion;    
    }

    public String getPropulsion(){
        return propulsion;
    }

    public void printDetail(){
        System.out.printf("Vehicle: %s\n",getClass().getSimpleName());
        System.out.printf("Manufacturer: %s\n",super.getBrand());
        System.out.printf("Colour: %s\n",super.getColour());
        System.out.printf("Year: %s\n",super.getYear());
        System.out.printf("Model: %s\n",super.getModel());
        System.out.printf("Propulsion: %s\n",propulsion);
    }
}
