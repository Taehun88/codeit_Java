package InnerClassExample;

public class Outer {
    private int instanceValue = 200;

    public class Inner {
        public void printInstanceValue() {
            System.out.println("Outer Instance Value: " + instanceValue);
        }
    }
}
