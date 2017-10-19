package vn.com.oNddleo.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import vn.com.oNddleo.model.User;

public interface UserDAO {
	public ArrayList<User> getAllUser() throws SQLException;
	public int getUserByID(String username) throws SQLException;
	public void addUser(User user) throws SQLException;
	public void updateUser(User user, String username) throws SQLException;
	public void deleteUser(String username) throws SQLException;
	public boolean checkUser(User user) throws SQLException;
}
