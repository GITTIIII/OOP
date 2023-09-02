package lab8_2;
import java.util.Scanner;
public class User implements UserToolBox{
    private String firstName;
    private String middleName;
    private String lastName;
    private Email email;
    private String password;
    Scanner sc = new Scanner(System.in);
    public User(String name, String domainName, String password){
        setName(name);
        email = new Email(getFirstName(),getLastName(),domainName);
        this.password = password;
    }

    public String getFirstName(){return firstName;}

    public String getMiddleName(){return middleName;}

    public String getLastName(){return lastName;}

    public Email getEmail(){return email;}
    
    public String getPassword(){return password;}

    public void setName(String name){
        String[] parts = name.split(" ");
        firstName = parts[0];
        middleName = parts[1];
        lastName = parts[2];
    }

    public void getInfo(){
        while(true){
            System.out.printf("Enter the password of \"%s\": ",email.getEmailAddress());
            String pass = sc.nextLine();
            if(pass.equals(getPassword())){
                System.out.println("First name: "+getFirstName());
                System.out.println("Middle name: "+getMiddleName());
                System.out.println("Last name: "+getLastName());
                email.getInfo();
                break;
            }        
            else{
                System.out.println("You don't have permission to access this information!");
            }
        }
    }
}
