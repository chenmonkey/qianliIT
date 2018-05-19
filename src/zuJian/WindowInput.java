package zuJian;

import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class WindowInput extends JFrame implements ActionListener{
	JTextArea area;
	JButton button;
	
	WindowInput(){
    	area=new JTextArea();
    	add(area,BorderLayout.CENTER);
    	add(new JScrollPane(area),BorderLayout.CENTER);
    	
    	button=new JButton("弹出输入对话框");
    	add(button,BorderLayout.NORTH);
    	button.addActionListener(this);
    	
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	public void actionPerformed(ActionEvent arg0) {
		String str=JOptionPane.showInputDialog(this,"输入数字，用空格分隔","输入对话框",JOptionPane.PLAIN_MESSAGE);
		if(str!=null){
			Scanner scan=new Scanner(str);
			double sum=0;
			int k=0;
			while(scan.hasNext()){
				try{
				double number=scan.nextDouble();
				if(k==0)
					area.append(""+number);
				else
					area.append("+"+number);
				sum=sum+number;
				k++;
				}
				catch(InputMismatchException exp){
					String t=scan.next();
				}
			}
			area.append("="+sum+"\n");
			}
		
	}
	
	public static void main(String args[]){
		WindowInput win=new WindowInput();
		win.setTitle("带输入对话框的窗口");
		win.setBounds(80,90,200,300);
	}
}
