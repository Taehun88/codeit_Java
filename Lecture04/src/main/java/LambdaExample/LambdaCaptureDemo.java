package LambdaExample;

public class LambdaCaptureDemo {
    private String memberField = "outer field";

    public void testLambda(){
        String localVar = "Local variable";

        Runnable r = () ->{
            System.out.println("member Field = " + memberField);

            System.out.println("localVar = " + localVar);

            //localVar = "change"; error 발생
        };

        r.run();
    }

    public static void main(String[] args) {
        LambdaCaptureDemo lambdaCaptureDemo = new LambdaCaptureDemo();
    }
}
