package app;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup> {

    private int index;
    private final List<StudentGroup> studentGroupList;

    public StudentStreamIterator(StudentStream studentStream) {
        this.index = 0;
        this.studentGroupList = studentStream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size() - 1;
    }

    @Override
    public StudentGroup next() {
        return studentGroupList.get(index);
    }

    @Override
    public void remove() {
        studentGroupList.remove(index);
    }
}
