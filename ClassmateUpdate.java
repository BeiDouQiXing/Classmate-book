package swing;

import javax.swing.*;  

  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

  
public class ClassmateUpdate extends JFrame implements ActionListener {  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// �������  
    JLabel jl2,jl1,jl3,jl4,jl5,jl6,jl7 = null;  
    JTextField jtf_name_alter,jtf_address_alter,jtf_tel_alter,jtf_wechat_alter,jtf_mail_alter,jtf_qq_alter,jtf_lan_alter = null;  
    JButton jb_alter,jb2 = null;  
    JPanel jp1, jp2,jp3,jp4,jp5,jp6,jp7,jp8 = null;  
  
    // ���캯��  
    public ClassmateUpdate() {  
        // �������       
        jl1 = new JLabel("    ����");  
        jl2=new JLabel("��ͥסַ");    
        jl3=new JLabel("    �绰");  
        jl4=new JLabel("    ΢��");  
        jl5=new JLabel("    ����");  
        jl6=new JLabel("      QQ");  
        jl7=new JLabel("��������");  
        
          
        jtf_name_alter = new JTextField(20);  
        jtf_address_alter = new JTextField(20);  
        jtf_tel_alter = new JTextField(20);  
        jtf_wechat_alter = new JTextField(20);  
        jtf_mail_alter = new JTextField(20); 
        jtf_qq_alter = new JTextField(20); 
        jtf_lan_alter = new JTextField(20); 
        
        jb_alter = new JButton("�޸�");  
        jb2 = new JButton("����");  
        // ���ü���  
        jb_alter.addActionListener(this);  
        jb2.addActionListener(this);   
          
        jp1 = new JPanel();  
        jp2 = new JPanel();  
        jp3 = new JPanel();  
        jp4 = new JPanel();  
        jp5 = new JPanel();   
        jp6 = new JPanel();
        jp7 = new JPanel();
        jp8 = new JPanel();
  
        jp1.add(jl1);  
        jp1.add(jtf_name_alter);   
        jp1.setLayout(new FlowLayout());  
          
        jp2.add(jl2);  
        jp2.add(jtf_address_alter);  
        jp2.setLayout(new FlowLayout());  
  
        jp3.add(jl3);  
        jp3.add(jtf_tel_alter);  
        jp3.setLayout(new FlowLayout()); 
        
        jp4.add(jl4);  
        jp4.add(jtf_wechat_alter);  
        jp4.setLayout(new FlowLayout()); 
        
        jp6.add(jl5);  
        jp6.add(jtf_mail_alter);   
        jp6.setLayout(new FlowLayout());
        
        jp7.add(jl6);  
        jp7.add(jtf_qq_alter);   
        jp7.setLayout(new FlowLayout());
        
        jp8.add(jl7);  
        jp8.add(jtf_lan_alter);   
        jp8.setLayout(new FlowLayout());
        
        jp5.add(jb_alter);  
        jp5.add(jb2);  
  
        this.add(jp1);  
        this.add(jp2);   
        this.add(jp3);   
        this.add(jp4);  
        this.add(jp6);
        this.add(jp7);
        this.add(jp8);
        this.add(jp5);  
          
        this.setLayout(new GridLayout(10, 1)); //�������������ò��� 10��1��
        this.setTitle("ѧ����Ϣ�޸�");  
        this.setSize(250,350);  
        this.setLocation(500, 200);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //���ÿ���
        this.setVisible(true);  
        this.setResizable(false);  
          
  
    }  
  
    @Override  
    public void actionPerformed(ActionEvent e) {  
  
        if (e.getActionCommand().equals("�޸�")  &&!jtf_name_alter.getText().isEmpty()) {                         
             
            jtf_name_alter.setText("");  
            jtf_address_alter.setText("");  
            jtf_tel_alter.setText("");  
            jtf_wechat_alter.setText("");  
            jtf_mail_alter.setText("");
            jtf_qq_alter.setText("");
            jtf_lan_alter.setText("");
  
            
//          System.out.println(GetSQL.english);  
//          System.out.println(GetSQL.chinese);  
            // ������������   
              
                  
        }else if (e.getActionCommand().equals("����") )  
        {  
            // ��������ذ�ť
        	dispose();
        }
  
    }  
}

