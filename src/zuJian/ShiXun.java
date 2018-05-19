package zuJian;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ShiXun {
	public static void main(String args[]){
		final String userName="abc";
		final String password="123";
		JFrame jframe=new JFrame("登录界面");
		jframe.setBounds(800,400,400,300);
		jframe.setResizable(false);
		jframe.setLayout(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label1=new JLabel("姓名");
		label1.setBounds(100,5,500,100);
		jframe.add(label1);
		JLabel label2=new JLabel("密码");
		label2.setBounds(100,45,500,100);
		jframe.add(label2);
		final JTextField text1=new JTextField();
		text1.setBounds(140,40,130,30);
		jframe.add(text1);
		final JPasswordField text2=new JPasswordField();
		text2.setBounds(140,80,130,30);
		jframe.add(text2);
		JButton button=new JButton("Login");
		button.setBounds(100,150,170,40);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			if(userName.equals(text1.getText())&&password.equals(text2.getText())){
				JOptionPane.showMessageDialog(null, "登录成功","提示",JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null,"错误","提示",JOptionPane.ERROR_MESSAGE);
				text1.setText("");
				text2.setText("");
			}
		}
		});
		jframe.add(button);
		jframe.setVisible(true);
}	
}
