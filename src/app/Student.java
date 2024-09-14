package app;

public class Student extends User implements Comparable<Student>{

    private Integer studentId;

    public Student(Integer studentId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student student) {
        return this.studentId.compareTo(student.studentId);
    }
}
