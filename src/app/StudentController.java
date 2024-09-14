package app;

import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService;
    private final StudentStreamService studentStreamService;
    private final StudentView studentView;
    public StudentController() {
        studentGroupService = new StudentGroupService();
        studentStreamService = new StudentStreamService();
        studentView = new StudentView();
    }


    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentListByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentListByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<StudentStream> getSortedStudentStreamListBySize(List<StudentStream> studentStreamList) {
        return studentStreamService.getSortedStudentStreamListBySize(studentStreamList);
    }


    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
