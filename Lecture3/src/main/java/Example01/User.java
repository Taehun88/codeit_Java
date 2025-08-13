package Example01;

public class User {
    private String userId;
    private String name;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public void printUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
}
