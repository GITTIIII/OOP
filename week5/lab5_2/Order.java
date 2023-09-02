package week5.lab5_2;
public class Order {
    Customer custumer = new Customer();
    Book[] books = new Book[10];
    float sum = 0;
    int count = 0;
    public Order(){
    }

    public Order(Customer c){
        custumer = c;
    }

    public Customer getCustomer(){
        return custumer;
    }

    public void cart(Book b){
        books[count]=b;
        System.out.println(custumer.getCname()+" register "+books[count].getbname()+" ["+books[count].getbtype()+"] "+books[count].getprice()+" Bath");
        sum+=books[count].getprice();
        count++;
    }   

    public float getDiscount(){
        if(custumer.getCtype().equals("VIP")){
            return sum*(float)15/100;
        }
        else if(custumer.getCtype().equals("Student")){
            for(Book type : books){
                if(type.getbtype().equals("Education")){
                    return type.getprice()*(float)20/100;
                }
            }
        }
        return 0;
    }
    
    public double getTotalPrice(){
        return sum - getDiscount();
    }
}
