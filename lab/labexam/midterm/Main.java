package labexam.midterm;

public class Main{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Komsan");
        p1.setAge(19);
        p1.setSex("Male");
        p1.ShowPersonDetail();

        Person p2 = new Person("B",17,"Male");
        p2.ShowPersonDetail();

        Person p3 = new Person("C",17,"Male");
        p3.ShowPersonDetail();

        Person p4 = new Person("D",17,"Male");
        p4.ShowPersonDetail();

        Person p5 = new Person("E",17,"Male");
        p5.ShowPersonDetail();

        Room r1 = new Room();
        r1.setRname("ROOM1");
        r1.setPersons(p1,0); 
        r1.setPersons(p2,1); 
        r1.setPersons(p3,2); 
        r1.ShowRoomPerson();

        Room r2 = new Room();
        Person[] pp = new Person[2];
        r2.setRname("ROOM2");
        pp[0] = p4;
        pp[1] = p5;
        r2.setPersons(pp);
        r2.ShowRoomPerson();
    }
}