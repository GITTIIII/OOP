package lab8_2;

public class MainClass {
    
    public static void main(String[] args) {
        User user1 = new User("Mark Elliot Zuckerberg", "meta","facebook");
        user1.getInfo();
        System.out.println();
        
        User user2 = new User("Steven Paul Jobs", "apple", "123Apple");
        user2.getInfo();
        System.out.println();
        
        User user3 = new User("William Henry Gates", "microsoft","Windows11");
        user3.getInfo();
    }
}

