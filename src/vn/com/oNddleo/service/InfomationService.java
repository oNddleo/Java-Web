package vn.com.oNddleo.service;

import java.sql.SQLException;

import vn.com.oNddleo.dao.InformationDAOImpl;
import vn.com.oNddleo.model.Information;

public class InfomationService {
	private static InformationDAOImpl infoDAOImpl = null;
	public static void addInformation(Information info) {
		infoDAOImpl = new InformationDAOImpl();
		try {
			infoDAOImpl.addInfo(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void deleteInformation(int userID) {
		infoDAOImpl = new InformationDAOImpl();
		try {
			infoDAOImpl.deleteInfo(userID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void updateInformation(Information info) {
		infoDAOImpl = new InformationDAOImpl();
		try {
			infoDAOImpl.updateInfo(info);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
