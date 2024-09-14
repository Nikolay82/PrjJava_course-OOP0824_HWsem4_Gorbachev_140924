package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {

    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<>();
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        int newTeacherId = teacherList.size() + 1;
        teacherList.add(new Teacher(newTeacherId, firstName, lastName, middleName));
    }


    public void removeTeacherByFIO(String firstName, String lastName, String middleName) {
        Iterator<Teacher> iterator = teacherList.listIterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                iterator.remove();
            }
        }
    }

    public void removeTeacherByID(Integer teacherId) {
        Iterator<Teacher> iterator = teacherList.listIterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getTeacherId() == teacherId) {
                iterator.remove();
            }
        }
    }

    public Teacher searchTeacherByFIO(String firstName, String lastName, String middleName) {
        for (Teacher teacher: teacherList) {
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                return teacher;
            }
        }
        return null;
    }

    public Teacher searchTeacherByID(Integer teacherId) {
        for (Teacher teacher: teacherList) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    public boolean editTeacher(Teacher editTeacher, Teacher newTeacher) {
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).equals(editTeacher)) {
                teacherList.set(i, newTeacher);
                return true;
            }
        }
        return false;
    }

    public List<Teacher> getSortedTeacherList() {
        List<Teacher> sortedTeacherList = new ArrayList<>(teacherList);
        Collections.sort(sortedTeacherList);
        return sortedTeacherList;
    }

    public List<Teacher> getSortedTeacherListByFIO() {
        List<Teacher> sortedTeacherList = new ArrayList<>(teacherList);
        sortedTeacherList.sort(new UserComparator<Teacher>());
        return sortedTeacherList;
    }
}
