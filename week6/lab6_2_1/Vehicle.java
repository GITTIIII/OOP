package lab6_2_1;

public class Vehicle {
    private String brand = "";
    private String colour = "";
    private String year = "";
    private String model = "";

    public Vehicle(){
    }

    public Vehicle(String brand, String colour, String year, String model){
        this.brand = brand;
        this.colour = colour;
        this.year = year;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColour(){
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getYear(){
        return year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void printDetail(){
    }
}
