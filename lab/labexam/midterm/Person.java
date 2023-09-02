package labexam.midterm;

public class Person {
    private String name = "";
    private String sex = "";
    private int age = 0;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age, String sex){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void ShowPersonDetail(){
        System.out.printf("%s %d-year-old %s.\n",name,age,sex);
    }
}
