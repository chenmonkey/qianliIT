package zuJian;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class WindowMessage extends JFrame implements ActionListener{
	JTextField text;
    JTextArea area;
    String regex="[a-zA-Z]+";//英语字母出现1次或多次
    
    WindowMessage(){
    	text=new JTextField(22);
    	add(text,BorderLayout.NORTH);
    	text.addActionListener(this);
    	
    	area=new JTextArea();
    	add(area,BorderLayout.CENTER);
    	
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==text){
			String str=text.getText();
			if(str.matches(regex)){
				area.append(str+",");
			}else{//弹出警告消息对话框
				JOptionPane.showMessageDialog(this, "您输入了非法字符", "消息对话框", JOptionPane.WARNING_MESSAGE);
				text.setText(null);
				
			}
		}
		
	}
public static void main(String args[]){
	WindowMessage win=new WindowMessage();
	win.setTitle("带消息对话框的窗口");
	win.setBounds(80,90,200,300);
}
}
