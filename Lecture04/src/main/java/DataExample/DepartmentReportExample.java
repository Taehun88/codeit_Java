package DataExample;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee1{
    private String name;
    private String dept;
    private int salary;

    public Employee1(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}
public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employee1> emps = Arrays.asList(
                new Employee1("Alice", "HR", 3000),
                new Employee1("Bob", "IT", 4000),
                new Employee1("Charlie", "IT", 4500),
                new Employee1("David", "HR", 3200),
                new Employee1("Eve", "Sales", 3500)
        );

        Map<String, IntSummaryStatistics> deptStat =
                emps.stream().collect(Collectors.groupingBy(
                Employee1::getDept, Collectors.summarizingInt(Employee1::getSalary)));

        deptStat.forEach((dept, stats) -> {
            System.out.println("== " + dept + " 부서 ==");
            System.out.println("사원 수: " + stats.getCount());
            System.out.println("총 연봉: " + stats.getSum());
            System.out.println("평균 연봉: " + stats.getAverage());
            System.out.println("최대 연봉: " + stats.getMax());
            System.out.println("최소 연봉: " + stats.getMin());
        });
    }
}
