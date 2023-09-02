package lab8_2;

public class Email implements ToolBox{
    private String emailAddress;
    private String userName;
    private String domainName;

    public Email(String firstname, String lastName, String domainName){
        userName = firstname+"."+lastName.charAt(0);
        this.domainName = domainName.toLowerCase()+".com";
        this.userName = userName.toLowerCase();
        emailAddress = userName+"@"+this.domainName;
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
