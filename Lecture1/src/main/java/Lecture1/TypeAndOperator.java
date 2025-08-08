package Lecture1;

public class TypeAndOperator {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a + b);  // 덧셈 → 13
        System.out.println(a - b);  // 뺄셈 → 7
        System.out.println(a * b);  // 곱셈 → 30
        System.out.println(a / b);  // 나눗셈 → 3 (정수 나눗셈)
        System.out.println(a % b);  // 나머지 → 1

        int x = 5, y = 10;

        System.out.println(x > y);   // false
        System.out.println(x <= y);  // true
        System.out.println(x == y);  // false
        System.out.println(x != y);  // true

        boolean a2 = true, b2 = false;

        System.out.println(a2 && b2);  // false (AND)
        System.out.println(a2 || b2);  // true  (OR)
        System.out.println(!a2);      // false (NOT)

        int num = 10;

        num += 5;  // num = num + 5 → 15
        num *= 2;  // num = num * 2 → 30

        int score = 85;
        String result = (score >= 90) ? "A학점" : "B학점";

        System.out.println("결과: " + result);  // 결과: B학점
    }
}
