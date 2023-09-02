package lab7_1;

public class MainClass{
    public static void main(String[] args){
        Person[] persons = new Person[4];
        persons[0] = new Student("Tom Holland", "Male", "B6300005");
        persons[1] = new Employee("Emma Watson", "Female", "Analyst");
        persons[2] = new Lecturer("Benedict Cumberbatch", "Male",55000.25);
        persons[3] = new Researcher("Kate Winslet", "Female", 42024.30);
        persons[0].setName("Eddie Redmayne");
        
        for (Person person : persons) {
            System.out.print(person.getBio() + ", ");
            person.getDetails();
            System.out.println();
        }
    }
}