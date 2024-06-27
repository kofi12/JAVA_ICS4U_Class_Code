package class_code;

public class Person {
    int age;
    GENDER gender;

    enum GENDER {
        MALE, FEMALE
    };

    String name;

    public Person() {
        // When we create a Person using the default constructor like this Person p =
        // new Person();
        // we give default values age, gender, and name
    }

    public Person(int age, GENDER gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public GENDER getGender() {
        return this.gender;
    }
}
