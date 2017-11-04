package swing;

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


 
public class Classmate_Interface extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel pane = null; // ��Ҫ��JPanel����JPanel�Ĳ��ֹ��������ó�CardLayout
    private JPanel p = null; // �Ű�ť��JPanel
    private CardLayout card = null; // CardLayout���ֹ�����
    private JButton b_1 = null, b_2 = null, b_3 = null,b_4 = null,b_5=null; // �ĸ���ֱ�ӷ�ת��JPanel����İ�ť
    private JPanel p_1 = null, p_2 = null, p_3 = null,p_4 = null; // Ҫ�л����ĸ���ҳ��JPanel����ɾ�Ĳ�
    //¼��ҳ�����
    JLabel jl_address,jl_name,jl_tel,jl_wechat,jl_mail,jl_qq,jl_lan = null;  
    JTextField jtf_name,jtf_address,jtf_tel,jtf_wechat,jtf_mail,jtf_qq,jtf_lan = null;  
    JButton jb_ack_add,jb_reset_add = null;  
    JPanel jp_name, jp_address,jp_tel,jp_wechat,jp5,jp_mail,jp_lan,jp_qq = null;
    //��ѯҳ�����
    JLabel jl5,jl6 = null;
    JTextField jtf_name_query = null;
    JButton jb_query = null;
    JPanel jp6,jp7,jp8 = null;
    DefaultTableModel model = null;  
    JTable table = null;  
    JScrollPane jsp = null; 
    int times = 0;
    JScrollPane scrollPane = new JScrollPane(table);
    
    //ɾ��ҳ�����
    JLabel jl7,jl8 = null;
    JTextField jtf_name_del = null;
    JButton jb_del_query,jb_del = null;
    JPanel jp9,jp10,jp11 = null;
    DefaultTableModel model1 = null;  
    JTable table1 = null;  
    JScrollPane jsp1 = null;
    //�޸�ҳ�����
    JLabel jl9,jl10 = null;
    JTextField jtf_name_altet = null;
    JButton jb_alter_query,jb_alter = null;
    JPanel jp12,jp13,jp14 = null;
    DefaultTableModel model2 = null;  
    JTable table2 = null;  
    JScrollPane jsp2 = null;
    ///////////////
    public Classmate_Interface() {
        super("ͬѧ¼");
        try {
            // ��LookAndFeel���ó�Windows��ʽ
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        /**����һ������ָ����ˮƽ�ʹ�ֱ��϶���¿�Ƭ����*/
        card = new CardLayout(5,5);
        pane = new JPanel(card); // JPanel�Ĳ��ֹ��������ó�CardLayout
        p = new JPanel(); // ����Ű�ť��JPanel
        b_1 = new JButton("��Ϣ¼��");
        b_2 = new JButton("��Ϣɾ��");
        b_3 = new JButton("��Ϣ�޸�");
        b_4 = new JButton("��Ϣ��ѯ");
        b_5 = new JButton("����Excel");
        
        b_1.setMargin(new Insets(20,20,20,20));
        b_2.setMargin(new Insets(20,20,20,20));
        b_3.setMargin(new Insets(20,20,20,20));
        b_4.setMargin(new Insets(20,20,20,20));
        b_5.setMargin(new Insets(20,20,20,20));

        p.add(b_1);
        p.add(b_2);
        p.add(b_3);
        p.add(b_4);
        p.add(b_5);

        
        p_1 = new JPanel();
        p_2 = new JPanel();
        p_3 = new JPanel();
        p_4 = new JPanel();
        
        //��Ϣ¼��ҳ�����
        jl_name = new JLabel("    ����");  
        jl_address=new JLabel("��ͥסַ");    
        jl_tel=new JLabel("    �绰");  
        jl_wechat=new JLabel("    ΢��"); 
        jl_mail=new JLabel("    ����"); 
        jl_qq=new JLabel("      QQ"); 
        jl_lan=new JLabel("��������"); 
        
        jtf_name = new JTextField(20);  
        jtf_address = new JTextField(20);  
        jtf_tel = new JTextField(20);  
        jtf_wechat = new JTextField(20); 
        jtf_mail = new JTextField(20); 
        jtf_qq = new JTextField(20); 
        jtf_lan = new JTextField(20); 
        
        jb_ack_add = new JButton("ȷ��");  
        jb_reset_add = new JButton("����");
        
        jp_name = new JPanel();  
        jp_address = new JPanel();  
        jp_tel = new JPanel();  
        jp_wechat = new JPanel();  
        jp5 = new JPanel();//jb1 jb2 ȷ������ҳ��
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
        
        
        //��Ϣ��ѯҳ�����
        jl5 = new JLabel("������ѧ��������");
        jtf_name_query = new JTextField(20);
        jb_query = new JButton("��ѯ");
        
        
        String[] colnames = { "����", "��ͥסַ", "�绰", "΢��","����","QQ","��������" };
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
        
        jp7.add(jsp);//�����ӱ��
        
        p_4.add(jp6);
        p_4.add(jp8);
        p_4.add(jp7);
        p_4.setLayout(new FlowLayout());
        
        /////////////////////////////////////////////////////////////////
       //��Ϣɾ��ҳ�����
        jl7=new JLabel("�������ɾ��ѧ��������");
        jtf_name_del = new JTextField(20);
        jb_del_query = new JButton("��ѯ");
        jb_del = new JButton("ɾ��");
        
        String[] colnames1 = { "����", "��ͥסַ", "�绰", "΢��","����","QQ","��������" };
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
        
      //��Ϣ�޸�ҳ�����
        jl9=new JLabel("��������޸�ѧ��������");
        jtf_name_altet = new JTextField(20);
        jb_alter_query = new JButton("��ѯ");
        jb_alter = new JButton("�޸�");
        
        jb_alter.addActionListener(new ActionListener() { // �����޸�ҳ�����޸�ʱ
            public void actionPerformed(ActionEvent e) {
            	
            		new ClassmateUpdate();
		
            }
        });
        String[] colnames2 = { "����", "��ͥסַ", "�绰", "΢��","����","QQ","��������" };
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
        
        
        pane.add(p_1, "p1");
        pane.add(p_2, "p2");
        pane.add(p_3, "p3");
        pane.add(p_4, "p4");
        /**�����Ƿ�ת����Ƭ���ֵ�ĳ��������ɲο�API�е��ĵ�*/
        b_1.addActionListener(new ActionListener() { // ֱ�ӷ�ת��p_1
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p1");
            }
        });
        b_2.addActionListener(new ActionListener() { // ֱ�ӷ�ת��p_2
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p2");
            }
        });
        b_3.addActionListener(new ActionListener() { // ֱ�ӷ�ת��p_3
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p3");
            }
        });
        b_4.addActionListener(new ActionListener() { // ֱ�ӷ�ת��p_3
            public void actionPerformed(ActionEvent e) {
                card.show(pane, "p4");
            }
        });
        this.getContentPane().add(pane);
        this.getContentPane().add(p, BorderLayout.NORTH);
     //   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(750, 625);
        this.setLocation(300, 50);
        this.setVisible(true);
    }
    
   public static void main(String[] args) {
	new Classmate_Interface();
}
}
