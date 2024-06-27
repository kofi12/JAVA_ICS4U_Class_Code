package src;

public class Person {
    int age;
    String name;

    public Person() {
        // When we create a Person using the default constructor like this Person p =
        // new Person();
        // we give default values age, gender, and name
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
}
