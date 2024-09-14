package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private String number;
    private List<Student> studentList;

    public StudentGroup(String number) {
        this.number = number;
        this.studentList = new ArrayList<>();
    }

    public void createStudent(String firstName, String lastName, String middleName) {
        int newStudentId = studentList.size() + 1;
        studentList.add(new Student(newStudentId, firstName, lastName, middleName));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
