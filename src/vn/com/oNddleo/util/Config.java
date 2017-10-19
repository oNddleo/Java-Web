package vn.com.oNddleo.util;

public class Config {
	public final static String DRIVE_NAME = "com.mysql.jdbc.Driver";
	public final static String MYSQL_DB = "exercise";
//	public final static String HOST = "node15215-nguyenduclong.kilatiron.com/";
	public final static String HOST = "localhost:3306/";
	public final static String CONNECTION_STRING = "jdbc:mysql://"+ HOST + MYSQL_DB + "?useSSL=false";
	
	public final static String MYSQL_USER = "root";
//	public final static String MYSQL_PASSWORD = "FOYzif68291";
	public final static String MYSQL_PASSWORD = "12345";
	
	public final static String GET_ALL_USER = "select * from user";
	public final static String GET_USER_BY_ID = "select iduser from user where username = ?";
	public final static String ADD_USER = "insert into user (username, password) value(?,?)";
	public final static String MODIFY_USER = "update user set username = ?, password = ? where username = ?";
	public final static String DELETE_USER = "delete from user where username = ?";
	public final static String CHECK_USER = "select * from user where username=? and password=?";
	
	
	public final static String ADD_INFORMATION = "insert into information(iduser, name, age, work, favorite, archivements, research) value(?, ?, ?, ?, ?, ?, ?)";
	public final static String MODIFY_INFORMATION = "update information set iduser = ?, name = ?, age = ?, work = ?, favorite = ?, archivements = ?, research = ? where iduser = ?";
	public final static String DELETE_INFORMATION = "delete from information where iduser = ?";
	
}
