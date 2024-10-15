public class StudentAttendance {
    private Student student;
    private boolean isPresent;
    public StudentAttendance(Student student, boolean isPresent){
        this.student = student;
        this.isPresent = isPresent;
    }
    public Student getStudent(){
        return this.student;
    }
    public boolean isPresent(){
        return this.isPresent;
    }
    public void mPresent(boolean present){
        isPresent = present;
    }
    public String toString(){
        return "Attendance{" + "student = " + student + ", isPresent = " + isPresent + '}';
    }
}
