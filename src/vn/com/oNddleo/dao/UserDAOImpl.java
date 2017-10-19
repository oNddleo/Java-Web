package vn.com.oNddleo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vn.com.oNddleo.model.User;
import vn.com.oNddleo.util.Config;
import vn.com.oNddleo.util.ConnectDB;

public class UserDAOImpl implements UserDAO{
	ConnectDB con = null;
	Connection connect = null;
	ArrayList<User> listUser = null;
	PreparedStatement state = null;
    ResultSet result = null;
    
    public UserDAOImpl() {
    		con = new ConnectDB();
	}
	@Override
	public ArrayList<User> getAllUser() throws SQLException {
		connect = con.getConnection();
		try {
			listUser = new ArrayList<User>();
			state = connect.prepareStatement(Config.GET_ALL_USER);
			result = state.executeQuery();
			while(result.next()) {
				ArrayList<String> props = new ArrayList<>();
				for(int i = 2; i <= User.numberOfProperties + 1; i++) {			
					props.add(result.getString(i).trim());
				}
				User user = new User(props);
				listUser.add(user);
			}
		} catch (Exception e) {
			throw new SQLException("Error: "+ e.getMessage());
		}
		finally {
			con.closeConnection();
		}
		return listUser;
	}

	@Override
	public int getUserByID(String username) throws SQLException {
		// TODO Auto-generated method stub
		connect = con.getConnection();
		int iduser = 0;
		try {
			state = connect.prepareStatement(Config.GET_USER_BY_ID);
			state.setString(1, username.trim());
			result = state.executeQuery();
			while(result.next()) {
				iduser = result.getInt(1);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
		return iduser;
	}

	@Override
	public void addUser(User user) throws SQLException{
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.ADD_USER);
			state.setString(1, user.getUsername().trim());
			state.setString(2, user.getPassword().trim());
			state.executeUpdate();
		} catch (Exception e) {
			throw new SQLException("Error: "+ e.getMessage());
		}
	}

	@Override
	public void updateUser(User user, String username) throws SQLException{
		// TODO Auto-generated method stub
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.MODIFY_USER);
			state.setString(1, user.getUsername().trim());
			state.setString(2, user.getPassword().trim());
			state.setString(3, username.trim());
			state.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
	}

	@Override
	public void deleteUser(String username) throws SQLException{
		// TODO Auto-generated method stub
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.DELETE_USER);
			state.setString(1, username.trim());
			state.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
	}
	@Override
	public boolean checkUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		boolean check = false;
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.CHECK_USER);
			state.setString(1, user.getUsername().trim());
			state.setString(2, user.getPassword().trim());
			result = state.executeQuery();
			check = result.next();
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
		return check;
	}
}
