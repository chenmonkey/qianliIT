import java.sql.*;

public class DataBase {
public static void main(String args[]) {
	Connection con;
	Statement sql;
	ResultSet rs;
	try {
		Class.forName("com.hxtt.sql.access.AccessDriver");
	}catch(ClassNotFoundException e) {
		System.out.println(e);
	}
	try {
		con=DriverManager.getConnection("jdbc:Access:///f:/shop.mdb");
		sql=con.createStatement();
		sql.executeUpdate("insert into goods values('A112','华为','2017/07/03',3420)");
	    sql.executeUpdate("update goods set name='大麦2s' where number='A008'");
	    sql.executeUpdate("delete from goods where number='A001'");
		rs=sql.executeQuery("select * from goods");
		while(rs.next()) {
			String number=rs.getString(1);
			String name=rs.getString(2);
			Date date=rs.getDate("madeTime");
			double price=rs.getDouble("price");
			System.out.printf("%2s",number);
			System.out.printf("%-6s",name);
			System.out.printf("%-15s",date.toString());
			System.out.printf("%6s\n",price);
		}
		con.close();
	}catch(SQLException e){
		System.out.println(e);
	}
}
}
