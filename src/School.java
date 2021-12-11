abstract public class School {
    private int enrollment;
    private String school_name;
    public abstract void describeLevel();
    public void setEnrollment(int students)
    {
        enrollment = students;
    }
    public int getEnrollment()
    {
        return enrollment;
    }
    public void setName(String name)
    {
        school_name = name;
    }
    public String getName()
    {
        return school_name;
    }
}
