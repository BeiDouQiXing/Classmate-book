package swing;

import javax.swing.*;  

  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  

  
public class SendEmail_UI extends JFrame implements ActionListener {  
  
	private static final long serialVersionUID = 1L;
	// 定义组件  
    JLabel jLabel =null;
    JTextArea jtf_content = null; 
    JButton jb_send,jb2 = null;  
    JPanel jp1,jp2 ,jp3= null;  
  
    // 构造函数  
    public SendEmail_UI() {  
        // 创建组件       
    	jLabel = new JLabel("请输入邮件内容");
    	jtf_content = new JTextArea(20,25); 
    	jtf_content.setTabSize(6);
    	jtf_content.setLineWrap(true);
    	jtf_content.setWrapStyleWord(true);
    	//jtf_content.setBackground(Color.pink);
        
        jb_send = new JButton("发送");  
        jb2 = new JButton("返回");  
        // 设置监听  
        jb_send.addActionListener(this);  
        jb2.addActionListener(this);   
        
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        
        jp1.add(jtf_content);
        jp1.setLayout(new FlowLayout());
        
        jp2.add(jb_send);  
        jp2.add(jb2); 
        jp3.add(jLabel);
//        this.add(jp3);
//        this.add(jp1);  
//        this.add(jp2); 
          
        this.setLayout(new BorderLayout(3, 2)); //给整个窗口设置布局 10行1列
        this.getContentPane().add("North",  jp3); 
        this.getContentPane().add("Center",  jp1);
        this.getContentPane().add("South",  jp2);
        this.setTitle("发送邮件");  
        this.setSize(300,250);  
        this.setLocation(500, 200);  
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        //设置可视
        this.setVisible(true);  
        this.setResizable(false);  
          
  
    }  
  
    @Override  
    public void actionPerformed(ActionEvent e) {  
  
        if (e.getActionCommand().equals("发送")  &&!jtf_content.getText().isEmpty()) {                         
             
            jtf_content.setText("");  
  
//          System.out.println(GetSQL.english);  
//          System.out.println(GetSQL.chinese);  
            // 将数据填入表格   
              
        }else if (e.getActionCommand().equals("返回") )  
        {  
            // 当点击返回按钮
        	dispose();
        }
  
    }  
}

