package labexam.finalexam;

public class URL implements ToolBox{
    private String url;
    private String domainName;
    private String userName;

    public URL(String url){
        this.url = url;
        String ss[] = url.split("www.");
        String ss1[] = ss[1].split("/~");
        domainName = ss1[0];
        userName = ss1[1];
    }

    public String getUrl(){
        return url;
    }

    public String getDomainName(){
        return domainName;
    }

    public String getUserName(){
        return userName;
    }

    public void getInfo(){
        System.out.println("URL: "+getUrl());
        System.out.println("User Name: "+getUserName());
        System.out.println("Domain Name: "+getDomainName());
    }
}
