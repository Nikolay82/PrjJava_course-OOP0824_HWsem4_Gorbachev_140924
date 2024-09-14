package app;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService;

    private final TeacherView teacherView;
    public TeacherController() {
        this.teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        teacherService.removeTeacherByFIO(firstName, lastName, middleName);
    }

    public void removeTeacherByID(Integer teacherId) {
        teacherService.removeTeacherByID(teacherId);
    }

    public Teacher searchTeacherByFIO(String firstName, String lastName, String middleName) {
        return teacherService.searchTeacherByFIO(firstName, lastName, middleName);
    }

    public Teacher searchTeacherByID(Integer teacherId) {
        return teacherService.searchTeacherByID(teacherId);
    }

    public boolean editTeacher(Teacher editTeacher, Teacher newTeacher) {
        return teacherService.editTeacher(editTeacher, newTeacher);
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> teacherList = teacherService.getSortedTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public List<Teacher> getSortedTeacherListByFIO() {
        List<Teacher> teacherList = teacherService.getSortedTeacherListByFIO();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
}
