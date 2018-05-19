package zuJian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WindowActionEvent extends JFrame implements ActionListener{
JTextField text;

public WindowActionEvent(){
	setLayout(new FlowLayout());
	text=new JTextField(10);
	add(text);
	text.addActionListener(this);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	String str=e.getActionCommand();
	System.out.println(str+":"+str.length());
	
	
}
public static void main(String args[]){
	WindowActionEvent win=new WindowActionEvent();
	win.setTitle("处理Action事件");
	win.setBounds(100,100,310,260);
}
}
