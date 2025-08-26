package DataExample;

import java.util.*;
import java.util.stream.Collectors;

class User {
    private String grade;
    double usageTime;
    User(String grade, double usageTime) {
        this.grade = grade;
        this.usageTime = usageTime;
    }

    public String getGrade() {
        return grade;
    }

    public double getUsageTime() {
        return usageTime;
    }

    @Override
    public String toString() {
        return "User{" + "grade=" + grade + ", usageTime=" + usageTime + '}';
    }
}
public class UserReportExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("silver", 40),
                new User("silver", 100),
                new User("gold", 50),
                new User("gold", 150),
                new User("bronze", 20),
                new User("bronze", 100)
        );

        Map<String, Double> avgUsageByGrade = users.stream().collect(
                Collectors.groupingBy(User::getGrade, Collectors.averagingDouble(User::getUsageTime))
        );

        avgUsageByGrade.forEach((key, value) -> System.out.println(key + " : " + value));

        Map<Boolean, List<User>> partitionUser = users.stream().collect(Collectors.partitioningBy(grade -> grade.getGrade().equals("gold")));
        System.out.println(partitionUser);


    }
}
