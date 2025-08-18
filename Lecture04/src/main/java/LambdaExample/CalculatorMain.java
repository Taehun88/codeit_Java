package LambdaExample;

interface Calculator {
    int operation(int a, int b);
}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        Calculator subtract = (a, b) -> {
            System.out.println("subtracting...");
            return a - b;
        };

        System.out.println("3 + 5 = " + add.operation(3, 5));
        System.out.println("8 - 2 = " + subtract.operation(8, 2));
    }
}
