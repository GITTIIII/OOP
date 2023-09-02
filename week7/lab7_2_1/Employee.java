package lab7_2_1;

public class Employee extends Person implements Payment{
    private double hour;
    private double day;
    private double rate;

    public Employee(){
    }

    public Employee(String name, String gender, String occupation){
        super(name, gender, occupation);
    }

    public Employee(String name, String gender, String occupation, double rate){
        super(name, gender, occupation);
        this.rate = rate;
    }

    public double getHour(){
        return hour;
    }

    public void setHour(double hour){
        this.hour = hour;
    }

    public double getDay(){
        return day;
    }

    public void setDay(double day){
        this.day = day;
    }

    public double getRate(){
        return rate;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double calculateSalary(){
        return this.day*this.hour*this.rate;
    }

    public void getDetails(){
        System.out.printf("Occupation: %s\nSalary: %.1f\n",getOccupation(),calculateSalary());
    }
}
