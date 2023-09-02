package labexam.finalexam;

public class Email implements ToolBox{
    private String emailAddress;
    private String localPart;
    private String domainName;

    public Email(String localPart, String domainName){
        this.localPart = localPart;
        this.domainName = domainName;
        this.emailAddress = localPart+"@"+domainName;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    public String getLocalPart(){
        return localPart;
    }

    public String getDomainName(){
        return domainName;
    }

    public void getInfo(){
        System.out.println("Domain Name: "+getDomainName());
        System.out.println("Local Part: "+getLocalPart());
        System.out.println("Email Address: "+getEmailAddress());
    }
}
