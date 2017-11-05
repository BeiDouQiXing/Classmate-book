//增删改查接口：
	
    /*
    /输入：Student 对象，即传入要添加的新学生
    /输出：无 
    /功能：往全局学生数组中添加一个新学生
    */
    public static void addStudent(Student stu);

    /*
    /输入：要删除的学生姓名，类型为 String
    /输出：无 
    /功能：将学生数组中该名字的学生姓名置空，达到删除目的
    */
    public static void removeStudent(String stuName);

    /*
    /输入：Student 对象，即要更新的学生信息
    /输出：无 
    /功能：按传入的对象更新学生数组中该名字的学生
    */
    public static void changeStudent(Student stu);

     /*
    /输入：学生姓名，类型为 String，即要查找的学生姓名
    /输出：Student 对象
    /功能：查找该名字的学生的信息
    */
    public static Student searchStudent(String stuName);

    
    
//学生类接口：
     
    private String name;   //姓名
    private String address;    //地址
    private String phoneNumber;   //电话
    private String weChat;   //微信
    private String mail;    //邮箱
    private String QQ;   //QQ 
    private String personalLanguage; //个性语言

    /*
    /输入：学生的各类信息
    /输出：无
    /功能：初始化学生信息
    */
    public void initStudent(String name,String address,String phoneNumber,String weChat,String mail,String qq,String personalLanguage) 
    
    /*
    /输入：无
    /输出：学生姓名
    /功能：返回学生姓名
    */
    public String getName();
    
    /*
    /输入：无
    /输出：地址
    /功能：返回地址
    */
    public String  getAddress();
    
    /*
    /输入：无
    /输出：电话
    /功能：返回电话
    */
    public String getPhoneNumber();
    
    /*
    /输入：无
    /输出：微信
    /功能：返回微信
    */
    public String getWeChat();
    
    /*
    /输入：无
    /输出：邮箱
    /功能：返回邮箱
    */
    public String getMail();
    
    /*
    /输入：无
    /输出：QQ
    /功能：返回QQ
    */
    public String getQQ();
    
    /*
    /输入：无
    /输出：个性语言
    /功能：返回个性语言
    */
    public String getPersonalLanguage();

    /*
    /输入：姓名,String类型
    /输出：无
    /功能：修改姓名
    */
    public void setName();
    
    /*
    /输入：地址,String类型
    /输出：无
    /功能：修改地址
    */
    public void setAddress();
    
    /*
    /输入：电话,String类型
    /输出：无
    /功能：修改电话
    */
    public void setPhoneNumber();
    
    /*
    /输入：微信,String类型
    /输出：无
    /功能：修改微信
    */
    public void setWeChat();
    
    /*
    /输入：邮箱,String类型
    /输出：无
    /功能：修改邮箱
    */
    public void setMail();
    
    /*
    /输入：QQ,String类型
    /输出：无
    /功能：修改QQ
    */
    public void setQQ();
    
    /*
    /输入：个性语言,String类型
    /输出：无
    /功能：修改个性语言
    */
    public void setPersonalLanguage();
     
    
    
//界面UI相应控件名称：
    
     一、信息录入界面：

     确认——按钮——jb_ack_add
     重置——按钮——jb_reset_add

     姓名——文本框——jtf_name
     家庭住址——文本框——jtf_address
     电话——文本框——jtf_tel
     微信——文本框——jtf_wechat
     邮箱——文本框——jtf_mail
     QQ——文本框——jtf_qq
     个性语言——文本框——jtf_lan

     二、信息删除界面

     姓名——文本框——jtf_name_del
     查询——按钮——jb_del_query
     删除——按钮——jb_del

     三、信息修改界面

     姓名——文本框——jtf_name_alter
     查询——按钮——jb_alter_query

     修改内容

     修改——按钮——jb_alter
     姓名——文本框——jtf_name_alter
     家庭住址——文本框——jtf_address_alter
     电话——文本框——jtf_tel_alter
     微信——文本框——jtf_wechat_alter
     邮箱——文本框——jtf_mail_alter
     QQ——文本框——jtf_qq_alter
     个性语言——文本框——jtf_lan_alter


     四、信息查询界面

     查询——按钮——jb_query
     姓名——文本框——jtf_name_query


     五、导出Excel

     导出Excel——按钮——jb_excel

     六、群发邮件

     内容——文本框——jtf_content
     发送——按钮——jb_send