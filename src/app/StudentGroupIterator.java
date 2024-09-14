package app;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int index;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.index = 0;
        this.studentList = studentGroup.getStudentList();
    }


    @Override
    public boolean hasNext() {
        return index < studentList.size() - 1;
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        return studentList.get(index++);
    }

    @Override
    public void remove() {
        studentList.remove(index);
    }
}
