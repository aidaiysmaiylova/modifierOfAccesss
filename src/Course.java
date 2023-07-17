import java.util.Arrays;

public class Course {
    private String nameOfCourse;
    private int number;
    private String nameOfTeacher;
    private Group[]massiv;

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public Group[] getMassiv() {
        return massiv;
    }

    public void setMassiv(Group[] massiv) {
        this.massiv = massiv;
    }

    public Course(String nameOfCourse, int number, String nameOfTeacher, Group[] massiv) {
        this.nameOfCourse = nameOfCourse;
        this.number = number;
        this.nameOfTeacher = nameOfTeacher;
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "Name of Course-" + nameOfCourse + '\'' +
                ", number-" + number +
                ", nameOfTeacher-'" + nameOfTeacher + '\'' +
                "Groups-" + Arrays.toString(massiv);
    }
}


