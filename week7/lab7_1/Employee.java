package lab7_1;

public class Employee extends Person {
    private final String occupation;

    Employee(String name, String gender, String occupation) {
        super(name, gender);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void getDetails() {
        System.out.println("Occupation: " + occupation);
    }
}
