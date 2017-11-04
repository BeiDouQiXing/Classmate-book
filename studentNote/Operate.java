package studentNote;

public class Operate {
    /*
    /���룺Student ����
    /������� 
    /���ܣ���ѧ�����������һ����ѧ��
    */
    public static void addStudent(Student stu) {
        for (Student s : Classmate_Interface_UI.Stu ) {
            if (s.getName() == null) {
                s.initStudent(stu.getName(), stu.getAddress(),
                    stu.getPhoneNumber(), stu.getWeChat(), stu.getMail(), 
                    stu.getQQ(), stu.getPersonalLanguage());
               break;
            }
        }
    }
    /*
    /���룺ѧ������������Ϊ String
    /������� 
    /���ܣ���ѧ�������и����ֵ�ѧ�������ÿգ��ﵽɾ��Ŀ��
    */
    public static void removeStudent(String stuQQ) {
        for (Student s : Classmate_Interface_UI.Stu) {
        	if(s == null)
        		break;
        	if(s.getName() == null||s.getName().equals(""))
        		continue;
            if (s.getQQ().equals(stuQQ)) {
                s.setName(null);
            }
        }
    }
    /*
    /���룺Student ����
    /������� 
    /���ܣ�������Ķ������ѧ�������и����ֵ�ѧ��
    */
    public static void changeStudent(Student stu) {
        String stuName = stu.getName();
        for (Student s : Classmate_Interface_UI.Stu) {
        	if(s == null)
        		break;
        	if(s.getName() == null||s.getName().equals(""))
        		continue;
            if (s.getQQ() == Classmate_Interface_UI.getQQ) {
                s.initStudent(stuName, stu.getAddress(),
                stu.getPhoneNumber(), stu.getWeChat(), stu.getMail(), 
                stu.getQQ(), stu.getPersonalLanguage());
            }
        }
    }
     /*
    /���룺ѧ������������Ϊ String
    /�����Student ����
    /���ܣ����Ҹ����ֵ�ѧ������Ϣ
    */
    public static Student[] searchStudent(String stuName) {
        Student [] theStudent = new Student[50];
        for(int i = 0 ; i < 50 ; i ++)
        {
        	theStudent[i] = new Student();
        }
        int len = 0;
        for (Student s : Classmate_Interface_UI.Stu) {
        	if(s == null)
        		break;
        	if(s.getName() == null||s.getName().equals(""))
        		continue;
        	
            if (s.getName().equals(stuName)) {
               theStudent[len++].initStudent(stuName, s.getAddress(),
                s.getPhoneNumber(), s.getWeChat(), s.getMail(), 
                s.getQQ(), s.getPersonalLanguage());
            }
        }     
        return theStudent; 
    }
}