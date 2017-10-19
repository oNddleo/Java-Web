import java.sql.SQLException;
import java.util.ArrayList;
import vn.com.oNddleo.model.User;
import vn.com.oNddleo.service.UserService;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> props = new ArrayList<>();
		props.add("ngocntb");
		props.add("12345");
		User user = new User(props);
		try {
			System.out.println(UserService.getUserByID("longnd"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			if(u.checkLogin(user)) {
//			System.out.println(u.checkLogin(user));}
//		} catch (SQLException e) {
//					// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			ArrayList<String> props = new ArrayList<>();
//			props.add("longnd");
//			props.add("12345");
//			User user = new User(props);
//			uimpl.updateUser(user, "admin");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    }
}