package Test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Abc extends JFrame {
	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton buttonBk,buttonC;
	JButton button[];
	JButton buttonAdd,buttonSub,buttonMul,buttonDiv,buttonEqual;
	double result;
	double num=0;
	int operator = 0;
	public Abc() {
		frame=new JFrame("计算器");
		frame.setBounds(200,600,400,300);
		panel=new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		ActionListener listener=new ComputerActionListener();
		text=new JTextField(20);
		text.setText("");
		JPanel keyup=new JPanel();
		keyup.setVisible(true);
		keyup.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonBk = new JButton("返回");
		buttonC = new JButton("AC");
		buttonBk.addActionListener(listener);
		buttonC.addActionListener(listener);
		keyup.add(buttonBk);
		keyup.add(buttonC);
		JPanel keydown=new JPanel();
		keydown.setLayout(new GridLayout(4,5));
		button=new JButton[10];
		for(int i=0;i<button.length;i++) {
			button[i]=new JButton(Integer.toString(i));
		}
		buttonAdd=new JButton("+");
		buttonSub=new JButton("-");
		buttonMul=new JButton("*");
		buttonDiv=new JButton("/");
		buttonEqual=new JButton("=");
		buttonAdd.addActionListener(listener);
		buttonSub.addActionListener(listener);
		buttonMul.addActionListener(listener);
		buttonDiv.addActionListener(listener);
		buttonEqual.addActionListener(listener);
		for(int i=0;i<10;i++) {
			button[i].addActionListener(listener);
		}
		for(int i=0;i<10;i++) {
			keydown.add(button[i]);
		}
		keydown.add(buttonAdd);
		keydown.add(buttonSub);
		keydown.add(buttonMul);
		keydown.add(buttonDiv);
		keydown.add(buttonEqual);
		panel.setLayout(new BorderLayout());
		panel.add(text,BorderLayout.NORTH);
	    panel.add(keyup,BorderLayout.CENTER);
		panel.add(keydown,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
class ComputerActionListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent event) {
		Object keyButton = event.getSource();
		String text1= text.getText();
		System.out.println(text1);
		//DecimalFormat df = new DecimalFormat("0.###########");
		if(keyButton==buttonBk&&text1.length()>0){
			text.setText(text1.substring(0,text1.length()-1));
		}
		if(keyButton==buttonC) {
			result = 0;
			text.setText("");
		}
		for(int i=0;i<10;i++){
			if(keyButton == button[i]){
			text.setText(i+"");
			result = Double.valueOf(text.getText());
		}
		}
		if(keyButton==buttonAdd) {
			operator = 1;
		}
		if(keyButton==buttonSub) {
			operator = 2;
		}
		if(keyButton==buttonMul) {
			operator = 3;
		}
		if(keyButton==buttonDiv) {
			operator = 4;
		}
		if(keyButton == buttonAdd || keyButton == buttonSub || keyButton == buttonMul || keyButton == buttonDiv||keyButton == buttonEqual){
			
			switch(operator){
			case 1:
				
			result += Double.parseDouble(text1);
			break;
			case 2:
			result -=Double.parseDouble(text1);
			break;
			case 3:
			result *=Double.parseDouble(text1);
			break;
			case 4:
			result /=Double.parseDouble(text1);
			break;
			default:
			result = Double.parseDouble(text1);
			}
			text.setText("");
			
		if(keyButton == buttonEqual){
			

			text.setText(result+"");
		}	
			
	}
	}
}
public static void main (String[] args) {
	Abc n=new Abc();

}
}
