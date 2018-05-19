package Test;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.*;


public class Cal extends JApplet implements ActionListener   {
	
		     
	private static final long serialVersionUID = 1L;  
	  private JTextField textField = new JTextField();  
	  String input = "";//输入的 式子  
		    public void init()//复写Applet里边的init方法  
		   {  
				Container c=getContentPane();
				JPanel jp = new JPanel();
				
				String s[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "=", "0", "C", "+" };
				JButton bt[];
				c.add(jp, BorderLayout.CENTER);
				c.add(textField, BorderLayout.NORTH);
		        jp.setLayout(new GridLayout(4,4,2,2));
				bt = new JButton[s.length];
				for (int i = 0; i < s.length; i++) {
					bt[i] = new JButton(s[i]);
					jp.add(bt[i]);
					bt[i].addActionListener(this);
		 }  
		   }
		   public void actionPerformed(ActionEvent e)   
		  {  
	        int cnt = 0;  
		       String actionCommand = e.getActionCommand();  
		        if(actionCommand.equals("+")||actionCommand.equals("-")||actionCommand.equals("*") ||actionCommand.equals("/"))  
	            input +=" "+actionCommand+" ";//设置输入，把输入的样式改成 需要的样子  
		        else if(actionCommand.equals("C"))  
		            input = "";  
	      else if(actionCommand.equals("="))//当监听到等号时，则处理 input  
		     {  
		           input+= "="+compute(input);  
		           textField.setText(input);  
		         input="";  
	         cnt = 1;  
		      }  
		       else  
		        input += actionCommand;//数字为了避免多位数的输入 不需要加空格  
	      if(cnt==0)  
		        textField.setText(input);  
		 }  
		    private String compute(String input) 
		   {  
		       String str[];  
		     str = input.split(" "); 
		    
		      Stack<Double> s = new Stack<Double>(); //构造有个Double型的栈对象
		       double m = Double.parseDouble(str[0]);  
		        s.push(m);  
		    for(int i=1;i<str.length;i++)  
	    {  
	          if(i%2==1)    
		           {    
		           if(str[i].compareTo("+")==0)    
		          {    
	                   double help = Double.parseDouble(str[i+1]);  
	                   //System.out.println(help);
                 s.push(help);    
		             }    
		                   
		               if(str[i].compareTo("-")==0)    
	              {    
		                   double help = Double.parseDouble(str[i+1]);   
		                   
		                   s.push(-help); 
		    
		                  
		               }    
	               if(str[i].compareTo("*")==0)    
	              {    
		                 double help = Double.parseDouble(str[i+1]);    
		                   double ans = s.peek();//取出栈顶元素   
		                  // System.out.println(ans);
		                  s.pop();//消栈    
		                    ans*=help;  
	                   s.push(ans);    
		              }    
		                  
		            if(str[i].compareTo("/")==0)    
		               {    
	                  double help = Double.parseDouble(str[i+1]);    
		                  double ans = s.peek();    
		                   s.pop();    
		                 ans/=help;    
	                  s.push(ans);    
		         }    
		         }    
		        }    
	       double ans = 0;    
		        while(!s.isEmpty())    
		        {    
		           ans+=s.peek();
		          // System.out.println(ans);
		        s.pop();    
		      }    
		        String result = String.valueOf(ans);  
		       return result;  
		 }  
	  public static void main(String args[])  
		    {  
	       JFrame frame = new JFrame("计算器");  
		        Cal applet = new Cal();  
	       frame.getContentPane().add(applet, BorderLayout.CENTER);  
		       applet.init();//applet的init方法  
		        applet.start();//线程开始  
		       frame.setSize(250, 200);//设置窗口大小  
		       frame.setVisible(true);//设置窗口可见  
	    }  
		 
		}  
