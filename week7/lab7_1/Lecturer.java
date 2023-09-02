package lab7_1;

final public class Lecturer extends Employee{
    private double salary;
    
    public Lecturer(String name, String gender, double salary) {
        super(name, gender, "Lecturer");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    final public void getDetails() {
        super.getDetails();
        System.out.println("Salary: " + salary);
    }
}
