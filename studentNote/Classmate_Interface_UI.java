package studentNote;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


 
public class Classmate_Interface_UI extends JFrame implements ActionListener {
    /**
	 * 
	 */
	public static String getQQ = new String();
	public static Student [] Stu = new Student[300];
	private static final long serialVersionUID = 1L;
	private JPanel pane = null; // 主要的JPanel，该JPanel的布局管理将被设置成CardLayout
    private JPanel p = null; // 放按钮的JPanel
    private CardLayout card = null; // CardLayout布局管理器
    private JButton b_1 = null, b_2 = null, b_3 = null,b_4 = null,b_5 = null,jb_excel=null; // 四个可直接翻转到JPanel组件的按钮
    private JPanel p_1 = null, p_2 = null, p_3 = null,p_4 = null; // 要切换的四个子页面JPanel，增删改查
    //录入页面变量
    JLabel jl_address,jl_name,jl_tel,jl_wechat,jl_mail,jl_qq,jl_lan = null;  
    JTextField jtf_name,jtf_address,jtf_tel,jtf_wechat,jtf_mail,jtf_qq,jtf_lan = null;  
    JButton jb_ack_add,jb_reset_add = null;  
    JPanel jp_name, jp_address,jp_tel,jp_wechat,jp5,jp_mail,jp_lan,jp_qq = null;
    
    //查询页面变量
    JLabel jl5,jl6 = null;
    JTextField jtf_name_query = null;
    JButton jb_query = null;
    JPanel jp6,jp7,jp8 = null;
    DefaultTableModel model = null;  
    JTable table = null;  
    JScrollPane jsp = null; 
    int times = 0;
    JScrollPane scrollPane = new JScrollPane(table);
    
    //删除页面变量
    JLabel jl7,jl8 = null;
    JTextField jtf_name_del = null;
    JButton jb_del_query,jb_del = null;
    JPanel jp9,jp10,jp11 = null;
    DefaultTableModel model1 = null;  
    JTable table1 = null;  
    JScrollPane jsp1 = null;
    //修改页面变量
    JLabel jl9,jl10 = null;
    JTextField jtf_name_altet = null;
    JButton jb_alter_query,jb_alter = null;
    JPanel jp12,jp13,jp14 = null;
    DefaultTableModel model2 = null;  
    public static JTable table2 = null;  
    JScrollPane jsp2 = null;
    ///////////////
    public Classmate_Interface_UI() {

        super("同学录");
        try {
            // 将LookAndFeel设置成Windows样式
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /**创建一个具有指定的水平和垂直间隙的新卡片布局*/
        card = new CardLayout(5,5);
        pane = new JPanel(card); // JPanel的布局管理将被设置成CardLayout
        p = new JPanel(); // 构造放按钮的JPanel
        b_1 = new JButton("信息录入");
        b_2 = new JButton("信息删除");
        b_3 = new JButton("信息修改");
        b_4 = new JButton("信息查询");
        jb_excel = new JButton("导出Excel");
        b_5 = new JButton("群发邮件");
        
        b_1.setMargin(new Insets(20,20,20,20));
        b_2.setMargin(new Insets(20,20,20,20));
        b_3.setMargin(new Insets(20,20,20,20));
        b_4.setMargin(new Insets(20,20,20,20));
        jb_excel.setMargin(new Insets(20,20,20,20));
        b_5.setMargin(new Insets(20,20,20,20));
        p.add(b_1);
        p.add(b_2);
        p.add(b_3);
        p.add(b_4);
        p.add(jb_excel);
        p.add(b_5);

        
        p_1 = new JPanel();
        p_2 = new JPanel();
        p_3 = new JPanel();
        p_4 = new JPanel();
        
        //信息录入页面设计
        jl_name = new JLabel("    姓名");  
        jl_address=new JLabel("家庭住址");    
        jl_tel=new JLabel("    电话");  
        jl_wechat=new JLabel("    微信"); 
        jl_mail=new JLabel("    邮箱"); 
        jl_qq=new JLabel("      QQ"); 
        jl_lan=new JLabel("个性语言"); 
        
        jtf_name = new JTextField(20);  
        jtf_address = new JTextField(20);  
        jtf_tel = new JTextField(20);  
        jtf_wechat = new JTextField(20); 
        jtf_mail = new JTextField(20); 
        jtf_qq = new JTextField(20); 
        jtf_lan = new JTextField(20); 
        
        jb_ack_add = new JButton("确定");  
        jb_reset_add = new JButton("重置");
        
        jp_name = new JPanel();  
        jp_address = new JPanel();  
        jp_tel = new JPanel();  
        jp_wechat = new JPanel();  
        jp5 = new JPanel();//jb1 jb2 确定重置页版
        jp_mail = new JPanel();
        jp_qq = new JPanel();
        jp_lan = new JPanel();
        
        jp_name.add(jl_name);  
        jp_name.add(jtf_name);   
        jp_name.setLayout(new FlowLayout());  
          
        jp_address.add(jl_address);  
        jp_address.add(jtf_address);  
        jp_address.setLayout(new FlowLayout());  
  
        jp_tel.add(jl_tel);  
        jp_tel.add(jtf_tel);  
        jp_tel.setLayout(new FlowLayout()); 
        
        jp_wechat.add(jl_wechat);  
        jp_wechat.add(jtf_wechat);  
        jp_wechat.setLayout(new FlowLayout()); 
        
        jp_mail.add(jl_mail);  
        jp_mail.add(jtf_mail);  
        jp_mail.setLayout(new FlowLayout()); 
        
        jp_qq.add(jl_qq);  
        jp_qq.add(jtf_qq);  
        jp_qq.setLayout(new FlowLayout()); 
        
        jp_lan.add(jl_lan);  
        jp_lan.add(jtf_lan);  
        jp_lan.setLayout(new FlowLayout()); 
        
        jp5.add(jb_ack_add);  
        jp5.add(jb_reset_add); 
        jp_wechat.setLayout(new FlowLayout()); 
 
  
        p_1.add(jp_name);  
        p_1.add(jp_address);   
        p_1.add(jp_tel);   
        p_1.add(jp_wechat); 
        
        p_1.add(jp_mail);
        p_1.add(jp_qq);
        p_1.add(jp_lan);
        
        p_1.add(jp5);
        p_1.setLayout(new GridLayout(10,1));
        
        jb_ack_add.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Student midS = new Student();
        		if(jtf_qq.getText()==null||jtf_qq.getText().equals("")||jtf_qq.getText().equals("null")){
        			JOptionPane.showMessageDialog(null,"数据录入失败，请输入必要的姓名和QQ号","提示消息",JOptionPane.WARNING_MESSAGE); 
        			return;
        		}
        		midS = reNeedStu(jtf_name.getText(),jtf_address.getText(),jtf_tel.getText(),jtf_wechat.getText(),jtf_mail.getText(),jtf_qq.getText(),jtf_lan.getText());
        		if(midS ==null)
        			return;
        		else
        		Operate.addStudent(midS);
        		Txt_Translate tT = new Txt_Translate();
        		tT.writeTxt(Stu);
        		JOptionPane.showMessageDialog(null,"数据录入成功","提示消息",JOptionPane.WARNING_MESSAGE); 
        	}
        });//录入页面点击确定
        
        jb_reset_add.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		jtf_name.setText("") ;  
                jtf_address.setText("") ;  
                jtf_tel .setText("") ;  
                jtf_wechat .setText("") ;  
                jtf_mail .setText("") ; 
                jtf_qq .setText("") ;  
                jtf_lan .setText("") ; 
        	}
        });//录入页面点击重置
        
        
        //信息查询页面设计
        jl5 = new JLabel("请输入学生姓名：");
        jtf_name_query = new JTextField(20);
        jb_query = new JButton("查询");
        
        
        String[] colnames = { "姓名", "家庭住址", "电话", "微信","邮箱","QQ","个性语言" };
        model = new DefaultTableModel(colnames, 1000); 
        table = new JTable(model); 
        jsp = new JScrollPane(table);
        
        jp6 = new JPanel();
        jp7 = new JPanel(); 
        jp8 = new JPanel();
        jp6.add(jl5);  
        jp6.add(jtf_name_query);  
        jp6.add(jb_query);
       //jp6.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        jp7.add(jsp);//面板添加表格
        
        p_4.add(jp6);
        p_4.add(jp8);
        p_4.add(jp7);
        p_4.setLayout(new FlowLayout());
        
        jb_query.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {    		
        		Student [] mid = new Student[50];    
        		mid = Operate.searchStudent(jtf_name_query.getText());
        		if(mid[0].getName() == null)
        		{
        			JOptionPane.showMessageDialog(null,"查无此人","提示消息",JOptionPane.WARNING_MESSAGE); 
        			return;
        		}
        		
        		int record = 0;
        		for(int i = 0 ; i <mid.length;i++)
        		{
        			if(mid[i] == null)
        				break;
        			if(mid[i].getName() == null)
        				break;
        			else
        			{
        				table.setValueAt(mid[i].getName(),i,0);
        				table.setValueAt(mid[i].getAddress(),i,1);
        				table.setValueAt(mid[i].getPhoneNumber(),i,2);
        				table.setValueAt(mid[i].getWeChat(),i,3);
        				table.setValueAt(mid[i].getMail(),i,4);
        				table.setValueAt(mid[i].getQQ(),i,5);
        				table.setValueAt(mid[i].getPersonalLanguage(),i,6);
        			}
        			record = i;
        		}
        		for(int i = record + 1;i<50;i++)
        		{
        			table.setValueAt("",i,0);
    				table.setValueAt("",i,1);
    				table.setValueAt("",i,2);
    				table.setValueAt("",i,3);
    				table.setValueAt("",i,4);
    				table.setValueAt("",i,5);
    				table.setValueAt("",i,6);
        		}

        			
        		
        	}
        });//查询页面点击查询
        /////////////////////////////////////////////////////////////////
        
       //信息删除页面设计
        jl7=new JLabel("请输入待删除学生姓名：");
        jtf_name_del = new JTextField(20);
        jb_del_query = new JButton("查询");
        jb_del = new JButton("删除");
        
        String[] colnames1 = { "姓名", "家庭住址", "电话", "微信","邮箱","QQ","个性语言" };
        model1 = new DefaultTableModel(colnames1, 1000); 
        table1 = new JTable(model1); 
        jsp1 = new JScrollPane(table1);
        
        jp9 = new JPanel();
        jp10 = new JPanel(); 
        jp11 = new JPanel();
        
        jp9.add(jl7);  
        jp9.add(jtf_name_del);  
        jp9.add(jb_del_query);
        jp9.add(jb_del);
        //jp9.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp11.add(jsp1);
        p_2.add(jp9);
        p_2.add(jp10);
        p_2.add(jp11);
        
        p_2.setLayout(new FlowLayout());
        
        
        jb_del.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String mid = new String();
        		mid = (String)table1.getValueAt(table1.getSelectedRow(), 5);
        		if(mid == null||mid.equals("")||mid.equals("null"))
        			return;
        		else
        		{
        		Operate.removeStudent(mid);
        		Txt_Translate tT = new Txt_Translate();
        		tT.writeTxt(Stu);
        		model1.removeRow(table1.getSelectedRow());
        		JOptionPane.showMessageDialog(null,"删除成功","提示消息",JOptionPane.WARNING_MESSAGE); 
        		}
        	}
        });//删除页面点击删除
        
        
        jb_del_query.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Student [] mid = new Student[50];    
        		mid = Operate.searchStudent(jtf_name_del.getText());
        		if(mid[0].getName() == null)
        		{
        			JOptionPane.showMessageDialog(null,"查无此人","提示消息",JOptionPane.WARNING_MESSAGE); 
        			return;
        		}
        		
        		int record = 0;
        		for(int i = 0 ; i <mid.length;i++)
        		{
        			if(mid[i] == null)
        				break;
        			if(mid[i].getName() == null)
        				break;
        			else
        			{
        				table1.setValueAt(mid[i].getName(),i,0);
        				table1.setValueAt(mid[i].getAddress(),i,1);
        				table1.setValueAt(mid[i].getPhoneNumber(),i,2);
        				table1.setValueAt(mid[i].getWeChat(),i,3);
        				table1.setValueAt(mid[i].getMail(),i,4);
        				table1.setValueAt(mid[i].getQQ(),i,5);
        				table1.setValueAt(mid[i].getPersonalLanguage(),i,6);
        			}
        			record = i;
        		}
        		for(int i = record + 1;i<50;i++)
        		{
        			table1.setValueAt("",i,0);
    				table1.setValueAt("",i,1);
    				table1.setValueAt("",i,2);
    				table1.setValueAt("",i,3);
    				table1.setValueAt("",i,4);
    				table1.setValueAt("",i,5);
    				table1.setValueAt("",i,6);
        		}
        		
        	}
        });//删除页面点击查询
        
      //信息修改页面设计
        jl9=new JLabel("请输入待修改学生姓名：");
        jtf_name_altet = new JTextField(20);
        jb_alter_query = new JButton("查询");
        jb_alter = new JButton("修改");
        
        jb_alter.addActionListener(new ActionListener() { // 当在修改页面点击修改时
            public void actionPerformed(ActionEvent e) {
            	
        		getQQ = (String)table2.getValueAt(table2.getSelectedRow(), 5);
        		if(getQQ == null||getQQ.equals("")||getQQ.equals("null"))
        			return;
        		for(int i = 0;i<50;i++)
        		{
        			table1.setValueAt("",i,0);
    				table1.setValueAt("",i,1);
    				table1.setValueAt("",i,2);
    				table1.setValueAt("",i,3);
    				table1.setValueAt("",i,4);
    				table1.setValueAt("",i,5);
    				table1.setValueAt("",i,6);
        		}
   
            		new ClassmateUpdate_UI();
            		
		
            }
        });
        String[] colnames2 = { "姓名", "家庭住址", "电话", "微信","邮箱","QQ","个性语言" };
        model2 = new DefaultTableModel(colnames2, 1000); 
        table2 = new JTable(model2); 
        jsp2 = new JScrollPane(table2);
        
        jp12 = new JPanel();
        jp13 = new JPanel(); 
        jp14 = new JPanel();
        
        jp12.add(jl9);  
        jp12.add(jtf_name_altet);  
        jp12.add(jb_alter_query);
        jp12.add(jb_alter);
        //jp9.setLayout(new FlowLayout(FlowLayout.LEFT));
        jp14.add(jsp2);
        p_3.add(jp12);
        p_3.add(jp13);
        p_3.add(jp14);
        
        p_3.setLayout(new FlowLayout());
        
        jb_alter_query.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Student [] mid = new Student[50];    
        		mid = Operate.searchStudent(jtf_name_altet.getText());
        		if(mid[0].getName() == null)
        		{
        			JOptionPane.showMessageDialog(null,"查无此人","提示消息",JOptionPane.WARNING_MESSAGE); 
        			return;
        		}
        		
        		int record = 0;
        		for(int i = 0 ; i <mid.length;i++)
        		{
        			if(mid[i] == null)
        				break;
        			if(mid[i].getName() == null)
        				break;
        			else
        			{
        				table2.setValueAt(mid[i].getName(),i,0);
        				table2.setValueAt(mid[i].getAddress(),i,1);
        				table2.setValueAt(mid[i].getPhoneNumber(),i,2);
        				table2.setValueAt(mid[i].getWeChat(),i,3);
        				table2.setValueAt(mid[i].getMail(),i,4);
        				table2.setValueAt(mid[i].getQQ(),i,5);
        				table2.setValueAt(mid[i].getPersonalLanguage(),i,6);
        			}
        			record = i;
        		}
        		for(int i = record + 1;i<50;i++)
        		{
        			table2.setValueAt("",i,0);
    				table2.setValueAt("",i,1);
    				table2.setValueAt("",i,2);
    				table2.setValueAt("",i,3);
    				table2.setValueAt("",i,4);
    				table2.setValueAt("",i,5);
    				table2.setValueAt("",i,6);
        		}
        		
        	}
        });//修改页面点击查询
        jb_alter.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		

        		
        	}
        });//修改页面点击修改
        
        pane.add(p_1, "p1");
        pane.add(p_2, "p2");
        pane.add(p_3, "p3");
        pane.add(p_4, "p4");
        /**下面是翻转到卡片布局的某个组件，可参考API中的文档*/
        b_1.addActionListener(new ActionListener() { // 直接翻转到p_1
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p1");
            }
        });
        b_2.addActionListener(new ActionListener() { // 直接翻转到p_2
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p2");
            }
        });
        b_3.addActionListener(new ActionListener() { // 直接翻转到p_3
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p3");
            }
        });
        b_4.addActionListener(new ActionListener() { // 直接翻转到p_3
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p4");
            }
        });
        b_5.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		new SendEmail_UI(); 		//点击群发邮件按钮
        	}
        });
        
        jb_excel.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){	
        		toExcel.toExcels(Stu);
        		JOptionPane.showMessageDialog(null,"excel导出成功！","提示消息",JOptionPane.WARNING_MESSAGE); 
        	}
        });//点击导出excel
        
        this.getContentPane().add(pane);
        this.getContentPane().add(p, BorderLayout.NORTH);
     //   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(750, 625);
        this.setLocation(300, 50);
        this.setVisible(true);
    }
    
   public static void main(String[] args) {
	   init();
	   new Classmate_Interface_UI();

}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
public static void init() {
	Txt_Translate tT = new Txt_Translate();
	tT.readTxt();
	for(int i =0;i<300;i++)
	Stu[i] = new Student();
	for(int i = 0 ; i<tT.reAllStuJson(); i ++) {	
		
		Stu[i].initStudent(tT.reName(i), tT.reAddress(i), tT.rePhoneNumber(i), tT.reWeChat(i),tT.reMail(i) , tT.reQQ(i),tT.rePersonalLanguage(i));
	}
}
public static Student reNeedStu(String thisName,String thisAddress,String thisPhoneNumber,String thisWeChat,String Mail,String thisQQ,String thisPersonalLanguage) {
	Student addStu = new Student();
	if(thisName == null||thisName.equals("")){
		JOptionPane.showMessageDialog(null,"请输入正确的姓名","提示消息",JOptionPane.WARNING_MESSAGE);
		return null;
	}
	else
	{
		addStu.initStudent(thisName, thisAddress, thisPhoneNumber,  thisWeChat,Mail ,thisQQ, thisPersonalLanguage);
		return addStu;
	}
}

}
