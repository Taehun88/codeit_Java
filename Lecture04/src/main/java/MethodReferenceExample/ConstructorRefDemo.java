package MethodReferenceExample;

@FunctionalInterface
interface PersonFactory{
    Person create(String name, int age);
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        PersonFactory factory = Person::new;

        Person p = factory.create("Kim", 20);

        System.out.println("Create person -> name: " + p.name + ", age: " + p.age);
    }


}
