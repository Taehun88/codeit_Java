package ExceptionExample;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        printStr(null);
        printStr("Hello, World!");
    }
    public static void printStr(String str){
        try{
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e){
            System.out.println("NullPointerException 발생: " + e.getMessage());
        } finally {
            System.out.println("finally 블록 실행");
        }
    }
}
