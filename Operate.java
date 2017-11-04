public class Operator {
    /*
    /输入：Student 对象
    /输出：无 
    /功能：往学生数组中添加一个新学生
    */
    public static void addStudent(Student stu) {
        for (Student s : Students) {
            if (s.getName() == NULL) {
                s.initStudent(stu.getName(), stu.getAddress(),
                    stu.getPhoneNumber(), stu.getWeChat(), stu.getMail(), 
                    stu.getQQ(), stu.getPersonalLanguage());
            }
        }
    }
    /*
    /输入：学生姓名，类型为 String
    /输出：无 
    /功能：将学生数组中该名字的学生姓名置空，达到删除目的
    */
    public static void removeStudent(String stuName) {
        for (Student s : Students) {
            if (s.getName() == stuName) {
                s.setName(NULL);
            }
        }
    }
    /*
    /输入：Student 对象
    /输出：无 
    /功能：按传入的对象更新学生数组中该名字的学生
    */
    public static void changeStudent(Student stu) {
        String stuName = stu.getName();
        for (Student s : Students) {
            if (s.getName() == stuName) {
                s.initStudent(stuName, stu.getAddress(),
                stu.getPhoneNumber(), stu.getWeChat(), stu.getMail(), 
                stu.getQQ(), stu.getPersonalLanguage());
            }
        }
    }
     /*
    /输入：学生姓名，类型为 String
    /输出：Student 对象
    /功能：查找该名字的学生的信息
    */
    public static Student searchStudent(String stuName) {
        Student theStudent;
        for (Student s : Students) {
            if (s.getName() == stuName) {
                theStudent.initStudent(stuName, s.getAddress(),
                s.getPhoneNumber(), s.getWeChat(), s.getMail(), 
                s.getQQ(), s.getPersonalLanguage());
            }
        }     
        return theStudent; 
    }
}