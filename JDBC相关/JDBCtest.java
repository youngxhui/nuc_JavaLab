import java.sql.SQLException;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
public class JDBCtest {
	public void TestDriver() throws SQLException
	{
		/*
		 * Driver是一个借口：数据库厂商必须提供实现的借口，能从其中获取
		 */
		//1.创建一个Driver实现类的对象
		Driver driver =new com.mysql.jdbc.Driver();
		//2.准备连接数据库的基本信息
		String url="";//jdbc:mysql://IP:端口号/数据库名
		Properties info=new Properties();
		info.put("user","root");
		info.put("password","admin");
		//3.调用Driver接口的connect(url,info)获取数据库连接
		Connection connection=driver.connect(url,info);
		System.out.println(connection);
		
	}
	/**
	 * 编写一个通用的方法，在不修改源程序的情况下，可以获取任何数据库的链接
	 * 解决方案：吧数据库驱动Driver实现类的全类名、url、password放入一个配置文件中，
	 * 通过修改配置文件的方式实现和具体的数据库解耦。
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException{
		String driverClass=null;
		String jdbcUrl=null;
		String user=null;
		String password=null;
		//读取类路径下的jdbc.properties 文件
		InputStream in=getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		//通过反射创建Driver对象。
		Properties info=new Properties();
		info.load(in);
		driverClass=info.getProperty("driver");
		jdbcUrl=info.getProperty("jdbcurl");
		user =info.getProperty("user");
		password=info.getProperty("password");
		Driver driver=(Driver)Class.forName(driverClass).newInstance();
		info.put("user",user);
		info.put("password",password);
		//通过Driver 的connect 方法 连接数据库
		Connection connection=driver.connect(jdbcUrl, info);
		return connection;
		}
	
}
