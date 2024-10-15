public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("一年级一班");

        // 创建小组
        Group group1 = new Group("第一组");
        Group group2 = new Group("第二组");

        // 向小组添加学生
        group1.addStudent(new Student("张三"));
        group1.addStudent(new Student("李四"));
        group2.addStudent(new Student("王五"));

        // 向班级添加小组和学生
        classroom.addGroup(group1);
        classroom.addGroup(group2);
        classroom.addStudent(new Student("赵六"));

        // 随机抽取小组
        Group randomGroup = classroom.getRandomGroup();
        System.out.println("随机抽取的小组是：" + (randomGroup != null ? randomGroup.groupName : "没有小组可以抽取"));

        // 从随机抽取的小组中抽取学生
        Student randomStudentInGroup = classroom.getRandomStudentInGroup(randomGroup);
        System.out.println("随机抽取的小组成员是：" + (randomStudentInGroup != null ? randomStudentInGroup.getName() : "没有学生可以抽取"));

        // 从全班随机抽取学生
        Student randomStudentInClassroom = classroom.getRandomStudentInClassroom();
        System.out.println("随机抽取的班级成员是：" + (randomStudentInClassroom != null ? randomStudentInClassroom.getName() : "没有学生可以抽取"));
    }
}