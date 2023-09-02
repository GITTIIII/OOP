package lab7_2_1;

public class Lecturer extends Employee implements PermanentPayment{
    private double rate;
    
    public Lecturer() {
    }

    public Lecturer(String name, String gender, double rate) {
        super(name, gender, "Lecturer");
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double calculateSalary(){
        return hour*day*this.rate;
    }
}
