package class_code;

public class Student extends Person {
    String studentNumber;

    GRADE grade;

    enum GRADE {
        GRADE_1,
        GRADE_2,
        GRADE_3,
        GRADE_4,
        GRADE_5,
        GRADE_6,
        GRADE_7,
        GRADE_8,
        GRADE_9,
        GRADE_10,
        GRADE_11,
        GRADE_12
    }

    public Student() {
        super(); // this super(); method refers to the default constructor of the superclass
                 // Person in this case
                 // after super(); we then give defaults to studentNumber and grade
    }

    public Student(int age, GENDER gender, String name, String studentNumber, GRADE grade) {
        super(age, gender, name); // this refers to the parameterized constructor in the superclass Person
                                  // So like this Person p = new Person(age, gender, name); assuming those
                                  // variables were created
        this.studentNumber = studentNumber;
        this.grade = grade;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public GRADE getGrade() {
        return this.grade;
    }
}
