package vn.com.oNddleo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vn.com.oNddleo.model.Information;
import vn.com.oNddleo.util.Config;
import vn.com.oNddleo.util.ConnectDB;

public class InformationDAOImpl implements InformationDAO{
	ConnectDB con = null;
	Connection connect = null;
	Information info = null;
	PreparedStatement state = null;
    ResultSet result = null;
    public InformationDAOImpl() {
    		con = new ConnectDB();
    }
	@Override
	public void updateInfo(Information info) throws SQLException {
		// TODO Auto-generated method stub
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.MODIFY_INFORMATION);
			state.setInt(1, info.getUserID());
			state.setString(2, info.getName().trim());
			state.setInt(3, info.getAge());
			state.setString(4, info.getWork().trim());
			state.setString(5, info.getFavorite().trim());
			state.setString(6, info.getArchivements().trim());
			state.setString(7, info.getResearch().trim());
			state.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
	}

	@Override
	public void addInfo(Information info) throws SQLException {
		// TODO Auto-generated method stub
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.ADD_INFORMATION);
			state.setInt(1, info.getUserID());
			state.setString(2, info.getName().trim());
			state.setInt(3, info.getAge());
			state.setString(4, info.getWork().trim());
			state.setString(5, info.getFavorite().trim());
			state.setString(6, info.getArchivements().trim());
			state.setString(7, info.getResearch().trim());
			state.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
	}

	@Override
	public void deleteInfo(int userID) throws SQLException {
		// TODO Auto-generated method stub
		connect = con.getConnection();
		try {
			state = connect.prepareStatement(Config.DELETE_INFORMATION);
			state.setInt(1, userID);
			state.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Error: "+ e.getMessage());
		}
	}
	
}
