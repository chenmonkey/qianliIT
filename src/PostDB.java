import java.sql.*;


public class PostDB {
	public static void main(String args[]) {
		Connection conn=null;
		Statement statement=null;//申明一个执行静态sql语句并返回它所生成结果的对象
		try{
		   Class.forName("org.postgresql.Driver");//加载JDBC驱动程序
		   String url = "jdbc:postgresql://localhost:5432/postgres";
		   conn=DriverManager.getConnection(url,"postgres","207913");
		  System.out.println("连接成功！ ");
		  String sql="select username,password from users";
		  statement=conn.createStatement();//将sql语句发送到数据库
		  statement.executeUpdate("insert into users(username,password) values('mark','456')");
		  statement.executeUpdate("update users set password='123' where username='mark'");
		  ResultSet result=statement.executeQuery(sql);//执行sql语句，返回记录集
		  while(result.next()) {
			 String username=result.getString(1);
			  String password=result.getString(2);
			  System.out.println(username);
			  System.out.println(password);
		  }
		  conn.close();
		} catch(Exception e){
			
		System.out.println(e);
		}
	

	}
	}
