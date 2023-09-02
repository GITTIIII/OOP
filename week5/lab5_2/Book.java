package week5.lab5_2;

public class Book {
    private String bname = "";
    private String bid = "";
    private String btype = "";
    private int price = 0;

    public Book(){
    }
    public Book(String bid, String bname, String btype , int price){
        this.bid = bid;
        this.bname = bname;
        this.btype = btype;
        this.price = price;
    }

    public String getbname(){
        return bname;
    }
    public void setbname(String bname){
        this.bname = bname;
    }

    public String getbid(){
        return bid;
    }
    public void setbid(String bid){
        this.bid = bid;
    }

    public String getbtype(){
        return btype;
    }
    public void setbtype(String btype){
        this.btype = btype;
    }

    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price = price;
    }
}
