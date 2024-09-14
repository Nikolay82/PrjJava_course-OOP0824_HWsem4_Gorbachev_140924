package app;

import java.util.Comparator;

public class StudentStreamComparator implements Comparator<StudentStream> {

    @Override
    public int compare(StudentStream studentStream1, StudentStream studentStream2) {
        return studentStream1.getStudentGroupList().size() - studentStream2.getStudentGroupList().size();
    }

}
