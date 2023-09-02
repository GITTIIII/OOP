package lab7_2_1;

public class Person {
    private String name;
    private String gender;
    private String occupation;

    public Person() {
    }

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }
    public Person(String name, String gender, String occupation) {
        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public String getBio(){
        return ("Name: "+getName()+" , Genger: "+getGender());
    }

    public void getDetails(){ 
    }

}
