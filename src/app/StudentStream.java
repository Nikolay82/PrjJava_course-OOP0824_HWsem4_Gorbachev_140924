package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {

    private final List<StudentGroup> studentGroupList;

    public StudentStream() {
        this.studentGroupList = new ArrayList<>();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(this);
    }
}
