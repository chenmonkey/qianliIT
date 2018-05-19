package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	JPanel jp = new JPanel(new GridLayout(4,4,2,2));
	JTextArea jt = new JTextArea();
	String s[] = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "=", "0", "C", "+" };
	JButton bt[];
	Double num1 = 0.0;
	Double num2 = 0.0;
	int key = -1;
	int pkey = -1;
	boolean number = false;

	Calculator() {
		super();
		setTitle("计算器");
		setSize(250, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		bt = new JButton[s.length];
		for (int i = 0; i < s.length; i++) {
			bt[i] = new JButton(s[i]);
			jp.add(bt[i]);
			bt[i].addActionListener(this);

		}
		add(jp, BorderLayout.CENTER);
		add(jt, BorderLayout.NORTH);

	}

	public static void main(String args[]) {
		new Calculator();
	}

	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand()控制不同的按钮时间，以作不同的响应
		String str = e.getActionCommand();
		if(str.equals("C")) {
			jt.setText("");
		}	
		if (str.equals("+")) {
			switch (pkey) {
			case 0:
				num2 += Double.parseDouble(jt.getText());
				//System.out.println(num2);
				break;
			case 1:
				num2 -= Double.parseDouble(jt.getText());
				break;
			case 2:
				num2 *= Double.parseDouble(jt.getText());
				break;
			case 3:
				if (jt.getText().equals("0")) {
					number = false;
				} else {
					key = -1;
					num2 /= num1;
					jt.setText(Double.toString(num2));
					break;
				}
			default:
				num2 = Double.parseDouble(jt.getText());

			}
			pkey = key = 0;
			jt.setText("");
		}

		if (str.equals("-")) {
			switch (pkey) {
			case 0:
				num2 += Double.parseDouble(jt.getText());
				break;
			case 1:
				num2 -= Double.parseDouble(jt.getText());
				break;
			case 2:
				num2 *= Double.parseDouble(jt.getText());
				break;
			case 3:
				if (jt.getText().equals("0")) {
					number = false;
				} else {
					key = -1;
					num2 /= num1;
					jt.setText(Double.toString(num2));
					break;
				}
			default:
				num2 = Double.parseDouble(jt.getText());
			}
			//输入符号时清除之前文本框里的内容
			pkey = key = 1;
			jt.setText("");
		}
		if (str.equals("*")) {
			switch (pkey) {
			case 0:
				num2 += Double.parseDouble(jt.getText());
				break;
			case 1:
				num2 -= Double.parseDouble(jt.getText());
				break;
			case 2:
				num2 *= Double.parseDouble(jt.getText());
				break;
			case 3:
				if (jt.getText().equals("0")) {
					number = false;
				} else {
					key = -1;
					num2 /= num1;
					jt.setText(Double.toString(num2));
					break;
				}
			default:
				num2 = Double.parseDouble(jt.getText());
			}
			pkey = key = 2;
			jt.setText("");
		}
		
		if (str.equals("/")) {
			switch (pkey) {
			case 0:
				num2 += Double.parseDouble(jt.getText());
				break;
			case 1:
				num2 -= Double.parseDouble(jt.getText());
				break;
			case 2:
				num2 *= Double.parseDouble(jt.getText());
			break;
			case 3:
				if (jt.getText().equals("0")) {
					number = false;
				} else {
					key = -1;
					num2 /= num1;
					jt.setText(Double.toString(num2));
					break;
				}
			default:
				num2 = Double.parseDouble(jt.getText());
			}
			pkey = key = 3;
			jt.setText("");
		}
		
		if (str.equals("=") && number) {
			if (pkey == 5) {
				switch (pkey) {
				case 0:
					num2 += num1;
					jt.setText(Double.toString(num2));
					break;
				case 1:
					num2 -= num1;
					jt.setText(Double.toString(num2));
					break;
			case 2:
				num2*=num1;
				jt.setText(Double.toString(num2));
				break;
			case 3:
				if (jt.getText().equals("0")) {
					number = false;
				} else {
					key = -1;
					num2 /= num1;
					jt.setText(Double.toString(num2));
					break;
				}
			}	
				}
			else {
				num1 = Double.parseDouble(jt.getText());
				switch (key) {
				case 0:
					key = -1;
					num2 += Double.parseDouble(jt.getText());
					jt.setText(Double.toString(num2));
					break;
				case 1:
					key = -1;
					num2 -= Double.parseDouble(jt.getText());
					jt.setText(Double.toString(num2));
					break;
				
				case 2:
					key=-1;
					num2*=Double.parseDouble(jt.getText());
					jt.setText(Double.toString(num2));
					break;
				case 3:
					if(jt.getText().equals("0")) {
						jt.setText("被除数不能为零");
						number=false;
					}else {
						key=-1;
						num2/=Double.parseDouble(jt.getText());
						jt.setText(Double.toString(num2));
						break;
					}
					
			}
				}

			pkey = 5;
		} else {
			//当点击的第一个按钮是数字按钮
			switch (str.charAt(0)) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				number = true;
				jt.setText(jt.getText() + str);
				break;
			}
		}

}
}