package lab7_1;

public class Researcher extends Employee{
    private double salary;

    public Researcher(String name, String gender, double salary) {
        super(name, gender, "Researcher");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Occupation: " + super.getOccupation() +"\nSalary: " + salary);
    }
}
