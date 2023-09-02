package lab6_2_1;

public class ElectricCar extends Car {
    private String battery = "";

    public ElectricCar(){
    }

    public ElectricCar(String brand, String colour, String year, String model, String bodystyle, String battery){
        super(brand,colour,year,model,bodystyle);
        this.battery = battery;    
    }

    public String getBattery(){
        return battery;
    }

    public void printDetail(){
        System.out.printf("Vehicle: %s\n",getClass().getSimpleName());
        System.out.printf("Manufacturer: %s\n",super.getBrand());
        System.out.printf("Colour: %s\n",super.getColour());
        System.out.printf("Year: %s\n",super.getYear());
        System.out.printf("Model: %s\n",super.getModel());
        System.out.printf("Body Style: %s\n",super.getbodystyle());
        System.out.printf("Battery Capacity: %s kWh\n",battery);
    }
}
