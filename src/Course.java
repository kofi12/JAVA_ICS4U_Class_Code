public class Course {
    private String courseName;
    private Teacher teacher;
    private Students[] students;

    public Course(){
        this.courseName = "default course name";
        this.teacher = new Teacher();
        this.students = new Students[3];
    }

    public Course(String courseName, Teacher teacher, Students[] students){
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = students;
    }

}
