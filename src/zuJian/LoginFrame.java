package zuJian;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
	JLabel label1, label2;
	JTextField text1, text2;
	JButton button1, button2;

	class LoginOKAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "登录中。。。");
			new MainFrame();
			setVisible(false);
		}
	}
	class LoginNOAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			text1.setText("");
			text2.setText("");
		}
	}

	public LoginFrame() {
		super();

		label1 = new JLabel("用户名：");
		add(label1);
		label1.setBounds(40, 40, 80, 30);

		label2 = new JLabel("密    码：");
		add(label2);
		label2.setBounds(40, 80, 80, 30);

		text1 = new JTextField();
		add(text1);
		text1.setBounds(130, 40, 150, 30);

		text2 = new JTextField();
		add(text2);
		text2.setBounds(130, 80, 150, 30);

		button1 = new JButton("登录");
		button2 = new JButton("重填");

		setSize(new Dimension(300, 205));
		setTitle("登录界面");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 240);
		setVisible(true);

		this.getContentPane().add(button1, null);
		this.getContentPane().add(button2, null);
		button1.setBounds(new Rectangle(140, 120, 60, 27));
		button2.setBounds(new Rectangle(210, 120, 60, 27));
		button1.addActionListener(new LoginOKAction());
		button2.addActionListener(new LoginNOAction());
	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}
