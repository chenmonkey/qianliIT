package zuJian;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Copy extends JFrame implements ActionListener{
	JLabel label1,label2;
	JTextField text1,text2;
    JButton button1,button2;
Copy(){
	setBackground(Color.black);
	setLayout(null);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	label1=new JLabel("用户名：");
	add(label1);
	label1.setBounds(40,40,80,30);
	
	
	label2=new JLabel("密    码：");
	add(label2);
	label2.setBounds(40,80,80,30);
	
	
	text1=new JTextField();
	//text1.setBackground(Color.RED);
	add(text1);
	text1.setBounds(130,40,150,30);
	
	text2=new JTextField();
	add(text2);
	text2.setBounds(130,80,150,30);
	
	button1=new JButton("登录");
	add(button1);
	button1.addActionListener(this);
	button1.setBounds(130,130,60,30);
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "跳转中。。。");
		new WindowMenu();
		setVisible(false);
	}
		
	
public static void main(String args[]){
	Copy copy=new Copy();
	copy.setTitle("登录界面");
	copy.setBounds(100,100,400,300);
}
}
