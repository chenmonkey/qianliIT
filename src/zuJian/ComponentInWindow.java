package zuJian;

import java.awt.FlowLayout;

import javax.swing.*;
public class ComponentInWindow extends JFrame{
JTextField text;
JButton button;
JCheckBox box1,box2,box3;
JRadioButton radio1,radio2;
//此类用于为一组按钮创建一个多斥（multiple-exclusion）作用域。
//使用相同的 ButtonGroup 对象创建一组按钮意味着“开启”其中一个按钮时，将关闭组中的其他所有按钮。
ButtonGroup group;//将单选按钮放入一个组里，使只能选择一个
JComboBox comBox;
JTextArea area;
public ComponentInWindow(){
	init();
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
private void init() {
	setLayout(new FlowLayout());
	add(new JLabel("文本框"));
	text=new JTextField(10);
	add(text);
	
	add(new JLabel("按钮"));
	button=new JButton("确定");
	add(button);
	
	add(new JLabel("选择框"));
	box1=new JCheckBox("喜欢音乐");
	box2=new JCheckBox("喜欢旅游");
	box3=new JCheckBox("喜欢睡觉");
	add(box1);
	add(box2);
	add(box3);
	
	add(new JLabel("单选按钮"));
	group=new ButtonGroup();
	radio1=new JRadioButton("男");
	radio2=new JRadioButton("女");
	
	group.add(radio1);//将radio1放入group里。group不是一个组件，所以不能放在窗口里
	group.add(radio2);
	
	add(radio1);//使radio1在窗口里显现出来
	add(radio2);
	
	add(new JLabel("下拉列表"));
	comBox=new JComboBox();
	comBox.addItem("吃饭");
	comBox.addItem("睡觉");
	comBox.addItem("出去玩");
	add(comBox);
	
	add(new JLabel("文本区:"));
	area=new JTextArea(6,12);
	add(new JScrollPane(area));//将area放入滚动窗格里，滚动窗格里只能添加一个组件
	
}
public static void main(String args[]){
	ComponentInWindow con=new ComponentInWindow();
	con.setBounds(100,100,310,260);
	con.setTitle("常用组件");
}
}
