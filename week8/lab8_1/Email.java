package lab8_1;

public class Email implements ToolBox{
    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(String emailAddress){
        this.emailAddress = emailAddress;
        String[] parts = emailAddress.split("@");
        userName = parts[0];
        domainName = parts[1];
    }

    public String getEmailAddress(){return emailAddress;}

    public String getUserName(){return userName;}

    public String getDomainName(){return domainName;}

    public void getInfo(){
        System.out.println("Email address: "+getEmailAddress());
        System.out.println("Username: "+getUserName());
        System.out.println("Domain name: "+getDomainName());
    }
}
