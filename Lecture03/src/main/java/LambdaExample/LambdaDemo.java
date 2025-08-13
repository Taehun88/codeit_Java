package LambdaExample;

@FunctionalInterface
interface MyCalculator {
    int operate(int a, int b);
}

public class LambdaDemo {

    public static void main(String[] args){
        MyCalculator addAnon = new MyCalculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("익명클래스: 3 + 5 = " + addAnon.operate(3, 5));

        MyCalculator addLambda = (a, b) -> a + b;
        System.out.println("람다식: 3 + 5 = " + addLambda.operate(3, 5));
    }
}
