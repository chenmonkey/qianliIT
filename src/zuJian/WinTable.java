package zuJian;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WinTable extends JFrame implements ActionListener{
	 JTable table;
	  //Object类是所有类的默认父类，所以在表格中输入一个数值时被认为是一个Object对象
	    Object a[][];
	    Object name[]={"姓名","英语成绩","数学成绩","总成绩"};
	    JButton button;
	    
	    WinTable(){
	    	a=new Object[8][4];
	    	for(int i=0;i<8;i++){
	    		for(int j=0;j<4;j++){
	    			if(j!=0)
	    				a[i][j]="0";
	    			else
	    				a[i][j]="姓名";
	    		}
	    	}
	    	button=new JButton("计算每个人的总成绩");
	    	table=new JTable(a,name);
	    	button.addActionListener(this);
	    	
	    	Container con=getContentPane();
	    	getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
	    	con.add(new JLabel("修改或录入数据后，需回车确认"), BorderLayout.SOUTH);
	    	con.add(button,BorderLayout.SOUTH);
	    	
	    	setSize(400,200);
	    	setVisible(true);
	    	validate();
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    
		
		public void actionPerformed(ActionEvent arg0) {
			for(int i=0;i<8;i++){
				double sum=0;
				boolean boo=true;
				for(int j=1;j<=2;j++){
					try{
						sum=sum+Double.parseDouble(a[i][j].toString());
					}catch(Exception ee){
						boo=false;
						table.repaint();
					}
					if(boo==true){
						a[i][3]=""+sum;
						table.repaint();
					}
				}
			}
			
		}
	public static void main(String args[]){
		new WinTable();
	}
	}