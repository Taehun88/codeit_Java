package Example01;

public class BusinessUser extends User{
    private String companyName;

    public BusinessUser(String name, String email, String companyName) {
        super(name, email);
        this.companyName = companyName;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("회사명: " + companyName);
    }
}
