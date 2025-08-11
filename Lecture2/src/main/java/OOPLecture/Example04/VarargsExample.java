package OOPLecture.Example04;

class Example {
    void print(int a, int b) {
        System.out.println("Two integers: " + a + ", " + b);
    }
    void print(int... nums){
        System.out.println("Varargs ints");
    }

    void disp(int... nums){
        System.out.println("Varargs disp");
    }
    void disp(int a, int... b){
        System.out.println("Varargs disp with int: " + a);
    }
}
public class VarargsExample {
    public static void main(String[] args){
        Example ex = new Example();
        ex.print(1,2);
    }
}
