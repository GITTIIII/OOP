package week5.lab5_1;
public class University {
    private String Uname;
    private String Province;

    public University(String Uname,String Province){
        this.Province = Province;
        this.Uname = Uname;
    }

    public University(){  
    }

    public String getUname(){
        return Uname;
    }

    public void setUName(String Uname){
        this.Uname = Uname;
    }

    public String getProvince(){
        return Province;
    }

    public void setProvince(String Province){
        this.Province = Province;
    }
}
