package LambdaExample;

class Greeter{
    private final String prefix;

    public Greeter(String prefix){
        this.prefix = prefix;
    }

    public void greet(String name){
        System.out.println(prefix + " : " + name);
    }
}

@FunctionalInterface
interface StringAction{
    void run(String input);

    default void info(){
        System.out.println("[info] StringAction default method");
    }

    static void help(){
        System.out.println("[help] StringAction default method");
    }
}

@FunctionalInterface
interface Broken {
    void a();
    //void b(); //when interface have 2 abstract function in functional interface, it occurs error
}

public class FunctionalVsClass {
    public static void main(String[] args) {
        // 일반 클래스 사용
        Greeter greeter = new Greeter("Hello");
        greeter.greet("Kim"); // 상태(prefix)를 내부에 유지 가능

        //함수형 인터페이스 구현체 1 - 익명 클래스
        StringAction printUpper1 = new StringAction() {
            @Override
            public void run(String input) {
                System.out.println(input.toUpperCase());
            }
        };

        //함수형 인터페이스 구현체 2 - 람다
        StringAction printUpper2 = s -> System.out.println(s.toUpperCase());

        printUpper1.run("hello");
        printUpper2.run("world");
    }
}
