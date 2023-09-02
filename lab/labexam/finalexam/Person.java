package labexam.finalexam;

public class Person{
    private URL url;
    private Email email;
    
    public Person(String url){
        this.url = new URL(url);
        String ss[] = url.split("www.");
        String ss1[] = ss[1].split("/~");
        email = new Email(ss1[1],ss1[0]);
    }

    public URL getUrl(){
        return url;
    }

    public Email getEmail(){
        return email;
    }
}