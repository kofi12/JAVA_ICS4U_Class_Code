public class School {
    private String name;
    private Teacher[] teachers;
    private Students[] students;

    public School(String name) {
        this.name = "Bronston";
        teachers = new Teacher[10];
        students = new Students[10];
    }

    public School(String name, Teacher[] teachers, Students[] students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }
}
