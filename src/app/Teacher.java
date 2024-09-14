package app;

public class Teacher extends User implements Comparable<Teacher>{

    private Integer teacherId;

    public Teacher(Integer teacherId, String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public int compareTo(Teacher teacher) {

        int resultOfComparing = this.teacherId.compareTo(teacher.getTeacherId());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = super.getFirstName().compareTo(teacher.getFirstName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = super.getLastName().compareTo(teacher.getLastName());
        if (resultOfComparing != 0) return resultOfComparing;

        resultOfComparing = super.getMiddleName().compareTo(teacher.getMiddleName());
        if (resultOfComparing != 0) return resultOfComparing;
        return 0;

    }
}
