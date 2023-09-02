package labexam.midterm;
public class Room {
    private int NumberOfPerson = 0;
    private String rname = "";
    private Person[] persons = new Person[10];

    public Room(){
    }

    public Room(Person[] p){
        persons = p;
    }

    public Room(Person p, int n){
        persons[n] = p;
    }

    public void setPersons(Person[] p){
        persons = p;
        NumberOfPerson = p.length;
    }

    public void setPersons(Person p, int n){
        persons[n] = p;
        NumberOfPerson += 1;
    }

    public Person[] getPerson(){
        return persons;
    }

    public String getRname(){
        return rname;
    }

    public void setRname(String rname){
        this.rname = rname;
    }

    public int getNuberOfPerson(){
        return NumberOfPerson;
    }

    public void setNumberOfPerson(int n){
        this.NumberOfPerson = n;
    }

    public void ShowRoomPerson(){
        System.out.printf("There is %d person in %s included:\n",NumberOfPerson,rname);
        for(Person p : persons){
            if(p!=null){
                System.out.println(p.getName());
            }
        }
    }
}
