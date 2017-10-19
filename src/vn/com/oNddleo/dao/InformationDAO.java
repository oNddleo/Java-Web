package vn.com.oNddleo.dao;

import java.sql.SQLException;

import vn.com.oNddleo.model.Information;

public interface InformationDAO {
	public void addInfo(Information info) throws SQLException;
	public void updateInfo(Information info) throws SQLException;
	public void deleteInfo(int userID) throws SQLException;
	
}
