package week5.lab5_2;

public class BookShop {
    public static void main(String[] args) {
        Customer c1 = new Customer("BS000001", "Mark", "VIP");
        Customer c2 = new Customer("BS000002", "William", "General");
        Customer c3 = new Customer("BS000003", "Edison", "Student");
        
        Book b1 = new Book("111111", "Software Testing", "Education",600);
        //Book b2 = new Book("222222", "Object-Oriented Programming","Education", 550);
        Book b3 = new Book("333333", "The Tempest", "Literature", 350);
        Book b4 = new Book("444444", "How to Cook Thai Foods", "Cooking",300);
        Book b5 = new Book("555555", "Age of Apocalypse", "Comic", 100);
        Book b6 = new Book("666666", "Avengers", "Comic", 70);
        
        Order o1 = new Order(c1);
        Order o2 = new Order(c2);
        Order o3 = new Order(c3);
        
        o1.cart(b1);
        o1.cart(b3);
        o1.cart(b5);
        
        System.out.println(o1.getCustomer().getCname() + "[" + o1.getCustomer().getCtype() + "]" + " have discount " + o1.getDiscount() +" Baht and have to pay " + o1.getTotalPrice() + " Baht\n");
        
        o2.cart(b3);
        o2.cart(b4);
        
        System.out.println(o2.getCustomer().getCname() + "[" +o2.getCustomer().getCtype() + "]" + " have discount " + o2.getDiscount() +" Baht and have to pay " + o2.getTotalPrice() + " Baht\n");
        
        o3.cart(b1);
        o3.cart(b5);
        o3.cart(b6);
        
        System.out.println(o3.getCustomer().getCname() + "[" +o3.getCustomer().getCtype() + "]" + " have discount " + o3.getDiscount() +" Baht and have to pay " + o3.getTotalPrice() + " Baht\n");
    }
}
