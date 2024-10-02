public class UnderGradStudent extends Student {
    String major;
    int year;

    public UnderGradStudent() {
        super();
    }

    public UnderGradStudent(int age, String name, String studentNumber, String major, int year) {
        super(age, name, studentNumber);

        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

/*
 * Person --
 * |
 * Student --
 * |
 * UnderGradStudent
 */