package lab7_1;

import java.util.Scanner;

abstract class Person {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public String getBio() {
        return "Name: " + name + ", Gender: " + gender;
    }

    abstract void getDetails();

    public void verifyUser(Scanner sc) {
    }
}
