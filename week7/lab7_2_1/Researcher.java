package lab7_2_1;

public class Researcher extends Employee implements PermanentPayment {
    private double rate;
    
    public Researcher() {
    }

    public Researcher(String name, String gender, double rate) {
        super(name, gender, "Resercher");
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
