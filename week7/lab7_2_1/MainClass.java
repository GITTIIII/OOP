package lab7_2_1;

public class MainClass{
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("Tom Holland", "Male", "B6300005");
        persons[1] = new Employee("Emma Watson", "Female", "Analyst",400);
        
        ((Employee) persons[1]).setHour(3); // casting
        ((Employee) persons[1]).setDay(10); // casting
        
        persons[2] = new Lecturer("Benedict Cumberbatch", "Male", 1000);
        persons[3] = new Researcher("Kate Winslet", "Female", 700);
        
        persons[0].setName("Eddie Redmayne");
        
        for (Person person : persons) {
            System.out.print(person.getBio() + ", ");
            person.getDetails();
            System.out.println();
        }
    }
}