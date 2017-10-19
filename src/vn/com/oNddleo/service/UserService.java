package vn.com.oNddleo.service;

import java.sql.SQLException;

import vn.com.oNddleo.dao.UserDAOImpl;
import vn.com.oNddleo.model.User;

public class UserService {
	private static UserDAOImpl userDAOImpl = null;
	public static boolean checkLogin(User user) throws SQLException {
		userDAOImpl = new UserDAOImpl();
		if(userDAOImpl.checkUser(user)) {
			return true;
		}
		return false;
	}
	public static int getUserByID(String username) throws SQLException{
		userDAOImpl = new UserDAOImpl();
		return userDAOImpl.getUserByID(username);
	}
	public static void addUser(User user) {
		userDAOImpl = new UserDAOImpl();
		try {
			userDAOImpl.addUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void updateUser(User user, String username) {
		userDAOImpl = new UserDAOImpl();
		try {
			userDAOImpl.updateUser(user, username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void deleteUser(String username) {
		userDAOImpl = new UserDAOImpl();
		try {
			userDAOImpl.deleteUser(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
