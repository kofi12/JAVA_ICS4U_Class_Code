package src;

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person p = new Person(4, "Jeff");
        System.out.println(p.getAge());
    }
}
