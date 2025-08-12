package Example01;

public class InheritanceTest {

    public static void main(String[] args){
        User u = new PersonalUser("U001", "Alice", "alice@example.com");
        u.printUserInfo();

        User b = new BusinessUser("U002", "Bob's Bakery", "Company");
        b.printUserInfo();
    }


}
