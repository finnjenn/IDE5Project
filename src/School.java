abstract public class School {
    private int enrollment;
    public abstract void describeLevel();
    public void setEnrollment(int students){
        enrollment = students;
    }
    public int getEnrollment() {
        return enrollment;
    }
}
