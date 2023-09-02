package labexam.finalexam;
import java.util.Scanner;
public class MainClassSec2 {
    public static void main(String[] args){
        String url;
        Person p1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        url = sc.nextLine();
        try{
            checkFormat(url);
            p1 = new Person(url);
            
        }
        catch (InputExeption e){
            System.out.println("orrcured:"+e);
        }
    }

    public static void checkFormat(String url)throws InputExeption{
        if (url.indexOf("www.")==-1) {
            throw new InputExeption("format!!");
        }
        String header = url.split("www.")[0];
        if (!header.equals("https://")){
            throw new InputExeption("format!!");
        }
        String  body = url.split("www.")[1];
        if (body.indexOf("/~")==-1) {
            throw new InputExeption("format!!");
        }
        String bodys[] = body.split("/~");
        if (bodys.length!=2) {
            throw new InputExeption("format!!");
        }
        if (bodys[1].indexOf("_")==-1) {
            throw new InputExeption("format!!");
        }
        String names[] = bodys[1].split("_");
        if (names.length!=2) {
            throw new InputExeption("format!!");
        }
    }
}
