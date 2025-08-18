package MethodReferenceExample;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {
    public void printString(String string) {
        System.out.println("String:"+ string);
    }

    public static void main(String[] args) {
        InstanceMethodRefDemo instanceMethodRefDemo = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        list.forEach(instanceMethodRefDemo::printString);
    }
}
