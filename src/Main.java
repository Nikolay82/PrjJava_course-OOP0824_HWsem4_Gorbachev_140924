import app.StudentController;
import app.TeacherController;

public class Main {
    public static void main(String[] args) {

        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        teacherController.create("fName", "lName", "mName");
        teacherController.getSortedTeacherList();
    }
}
