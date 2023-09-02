package lab7_1;

public class Student extends Person{
    private final String id;

    Student(String name, String gender, String id) {
        super(name, gender);
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public void getDetails() {
        System.out.println("Student ID: " + id);
    }
}
