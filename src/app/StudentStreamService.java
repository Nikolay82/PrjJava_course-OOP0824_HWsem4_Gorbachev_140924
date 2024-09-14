package app;

import java.util.List;

public class StudentStreamService {


    public List<StudentStream> getSortedStudentStreamListBySize(List<StudentStream> studentStreamList) {
        studentStreamList.sort(new StudentStreamComparator());
        return studentStreamList;
    }

}
