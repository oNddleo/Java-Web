package vn.com.oNddleo.model;

import java.util.ArrayList;

public class User {
	private String username;
	private String password;
	public static final int numberOfProperties = 2;
	public User(ArrayList<String> props) {
		int i = 0;
		this.username = props.get(i++);
		this.password = props.get(i++);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
