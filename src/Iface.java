import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Iface extends JFrame implements ActionListener {

	DefaultTableModel model = new DefaultTableModel();// 创建model对象，存储表格数据
	JTable display = new JTable(model);// 创建表格对象display,将表格数据存储在model内
	JButton saveInfor, seek, add, delete, change;// 创建保存、查询、增加、删除、更改按钮对象
	JPanel pNorth, pSouth;// 创建pNorth、pSouth面板对象
	// JTextField text;//申明一个单行文本框
	Connection conn;// 申明数据库连接对象conn
	String sql;// 申明sql字符串，用来存储sql语句
	Statement statement;// 申明向数据库发送sql语句的statement对象
	ResultSet result;// 申明记录集对象result,将执行sql语句的结果返回到result对象
	int id;// 申明id号，用来表示数据库内的字段
	String idText;
	String username, password;// 申明用户名、密码字符串，用来表示数据库内的字段
	String row, col;// 申明表格中的单元格内容
	int selectRow = 0;// 申明表格中鼠标选中的一行，初始值设为0

	Iface() {

		pNorth = new JPanel();
		pSouth = new JPanel();
		setTitle("数据库的增删改查");
		setBounds(100, 100, 600, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		saveInfor = new JButton("保存");
		add(saveInfor);
		pNorth.add(saveInfor);
		saveInfor.addActionListener(this);
		
		seek = new JButton("查询");
		pSouth.add(seek);
		seek.addActionListener(this);
		
		add = new JButton("增加");
		pSouth.add(add);
		add.addActionListener(this);
		
		delete = new JButton("删除");
		pSouth.add(delete);
		delete.addActionListener(this);
		
		change = new JButton("修改");
		pSouth.add(change);
		change.addActionListener(this);
		
		add(pNorth, BorderLayout.NORTH);
		add(pSouth, BorderLayout.SOUTH);
		
		/*
		 * 给表格设置列名
		 */
		model.addColumn("id");
		model.addColumn("用户名");
		model.addColumn("密码");
		add(new JScrollPane(display), BorderLayout.CENTER);
		
		/*
		 * 给鼠标添加监听事件
		 */
		display.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e0) {
				selectRow = display.getSelectedRow();// 得到鼠标选中的行数
				// System.out.println(selectRow);
			}
		});

		/*
		 * 连接数据库
		 */
		try {
			Class.forName("org.postgresql.Driver");// 加载JDBC驱动程序
			String url = "jdbc:postgresql://localhost:5432/postgres";
			conn = DriverManager.getConnection(url, "postgres", "207913");
			statement = conn.createStatement();

		} catch (Exception e) {

			System.out.println(e);
		}
	}

	
	
	public void actionPerformed(ActionEvent e) {
		/*
		 * 当点击“查询”按钮时，现将表格中数据清空，然后再将数据库中的数据显示在表格中
		 */
		if (e.getSource() == seek) {
			model.setRowCount(0);
			try {
				sql = "select * from users";
				// statement=conn.createStatement();
				result = statement.executeQuery(sql);
				while (result.next()) {
					id = result.getInt("id");
					idText = String.valueOf(id);
					username = result.getString("username");
					// System.out.println(username);
					password = result.getString("password");
					String s[] = { idText, username, password };
					model.addRow(s);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		/*
		 * 当点击“增加”按钮时，表格新增一行，可以向新增的一行中输入数据
		 */
		if (e.getSource() == add) {
			model.setRowCount(0);
			model.addRow(new Vector());
		}

		/*
		 * 当按“保存”按钮时，先是表格成为无法编辑状态，然后会向数据库中插入增加的数据
		 */
		if (e.getSource() == saveInfor) {

			display.getCellEditor().stopCellEditing();

			try {
				row = (String) model.getValueAt(0, 1);
				col = (String) model.getValueAt(0, 2);

				// 因为row和col是字符串，所以插入时要加单引号否则只能插入数字型数值而不能插入英文和文字
				statement.executeUpdate("insert into users(username,password) values('" + row + "','" + col + "')");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		/*
		 * 鼠标选中哪一行，按下“删除”按钮后就会删除哪一行
		 */
		if (e.getSource() == delete) {
			row = (String) model.getValueAt(selectRow, 1);
			col = (String) model.getValueAt(selectRow, 2);
			try {
				statement.executeUpdate("delete from users where username='" + row + "' and password='" + col + "'");
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}
		/*
		 * 在表格中修改数据，按下“修改”按钮后，表格退出编辑状态（即无法编辑表格内容），然后将修改的数据更新到数据库中
		 */
		if (e.getSource() == change) {
			display.getCellEditor().stopCellEditing();// 使表格退出编辑状态
			String num = (String) model.getValueAt(selectRow, 0);// 得到鼠标选中那一行的第一列的单元格数据的字符串
			id = Integer.valueOf(num);// 将鼠标选中那一行的第一列的单元格数据转化为数值形式
			row = (String) model.getValueAt(selectRow, 1);
			col = (String) model.getValueAt(selectRow, 2);
			try {
				// set后面用英文逗号(“,”)连接，不能用“and”连接,否则会报invalid input syntax for type boolean错误
				statement.executeUpdate("update users set username='" + row + "', password='" + col + "' where id= " + id );
				//"update users set username=?,password=? where id= ?");
				//ps.setString(0,row);
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		new Iface();
	}
}
