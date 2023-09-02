package lab7_2_1;

public class Student extends Person {
    private String sid;
    public Student(){
    }

    public Student(String name, String gender, String sid){
        super(name, gender);
        this.sid = sid;
    }

    public String getSid(){
        return sid;
    }

    public void setSid(String sid){
        this.sid = sid;
    }

    public void getDetails(){
        System.out.println("Student ID: "+getSid());
    }
}
