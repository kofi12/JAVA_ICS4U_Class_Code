public class Student extends Person {
    String studentNumber;

    public Student() {
        super(); // this super(); method refers to the default constructor of the superclass
                 // Person in this case
                 // after super(); we then give defaults to studentNumber and grade
    }

    public Student(int age, String name, String studentNumber) {
        super(age, name); // this refers to the parameterized constructor in the superclass Person
                          // So like this Person p = new Person(age, gender, name); assuming those
                          // variables were created
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
