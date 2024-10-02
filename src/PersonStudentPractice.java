public class PersonStudentPractice {
    public static void main(String[] args) {
        UnderGradStudent u = new UnderGradStudent();

        u.setName("Aaron");
        u.setAge(21);
        u.setStudentNumber("00001111");
        u.setMajor("Computer Science");
        u.setYear(1);
        System.out.printf(
                "We have a student named %s who's age %d with a student number: %s, majoring in %s and in year %d",
                u.getName(), u.getAge(), u.getStudentNumber(), u.getMajor(), u.getYear());
    }
}
