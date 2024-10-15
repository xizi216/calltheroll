import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//public class Classroom {
//    //存储班级学生
//    private List<Student> students;
//    private List<StudentAttendance> attendanceRecords;
//    //初始化
//    public Classroom(){
//        students = new ArrayList<>();
//        attendanceRecords = new ArrayList<>();
//    }
//    //添加学生
//    public void addStudent(Student newstudent){
//        students.add(newstudent);
//    }
//    //根据ID查找
//    public Student findStudentById(int id){
//        for(Student s : students){
//            if(s.getId() == id){
//                return s;
//            }
//        }
//        return null;
//    }
//    public void markAttendance(Student student, boolean isPresent){
//        StudentAttendance studentAttendance = new StudentAttendance(student, isPresent);
//        attendanceRecords.add(studentAttendance);
//    }
//    public void printAttendance() {
//        System.out.println("Attendance Records:");
//        for (StudentAttendance record : attendanceRecords) {
//            System.out.println(record);
//        }
//    }
//}
//


class Classroom {
    String className;
    List<Group> groups = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    public Classroom(String className) {
        this.className = className;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Group getRandomGroup() {
        if (groups.isEmpty()) return null;
        Random rand = new Random();
        int index = rand.nextInt(groups.size());
        return groups.get(index);
    }

    public Student getRandomStudentInClassroom() {
        if (students.isEmpty()) return null;
        Random rand = new Random();
        int index = rand.nextInt(students.size());
        return students.get(index);
    }

    public Student getRandomStudentInGroup(Group group) {
        if (group == null || group.students.isEmpty()) return null;
        Random rand = new Random();
        int index = rand.nextInt(group.students.size());
        return group.students.get(index);
    }
}
