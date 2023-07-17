import java.util.Arrays;

public class Group{
    private String lesson;
    private int startDateOfStyding;
    private Student[]massiv;

    public Group(String lesson, int startDateOfStyding, Student[] massiv) {
        this.lesson = lesson;
        this.startDateOfStyding = startDateOfStyding;
        this.massiv = massiv;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getStartDateOfStyding() {
        return startDateOfStyding;
    }

    public void setStartDateOfStyding(int startDateOfStyding) {
        this.startDateOfStyding = startDateOfStyding;
    }

    public Student[] getMassiv() {
        return massiv;
    }

    public void setMassiv(Student[] massiv) {
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "lesson-" + lesson + '\'' +
                ", startDateOfStyding-" + startDateOfStyding +
                "Students-" + Arrays.toString(massiv);
    }
}

