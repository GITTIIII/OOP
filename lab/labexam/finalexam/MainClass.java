package labexam.finalexam;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        String url;
        Person p1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        url = sc.nextLine();
        try{
            int temp = 0;
            char[] c = url.toCharArray();
            for(int x = 0 ; x<url.length() ; x++){
                if(c[x]=='/' && c[x+1]=='~'){
                    temp = 1;
                }
            }
            if(url.indexOf("http://www.")==0 && temp==1){
                p1 = new Person(url);
                p1.getUrl().getInfo();
                p1.getEmail().getInfo();
                sc.close();
            }
            else{
                throw new InputExeption("format!!");
            }
        }
        catch (InputExeption e){
            System.out.println("orrcured:"+e);
        }
    }
}
