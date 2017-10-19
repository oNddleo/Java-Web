package vn.com.oNddleo.model;

import java.util.ArrayList;

public class Information {
	private int userID;
	private String name;
	private int age;
	private String favorite;
	private String work;
	private String archivements;
	private String research;
	public static final int numberOfProperties = 7;
	public Information(ArrayList<Object> props) {
		int i = 0;
		this.userID = (int) props.get(i++);
		this.name = (String) props.get(i++);
		this.age = (int)props.get(i++);
		this.favorite = (String) props.get(i++);
		this.work = (String) props.get(i++);
		this.archivements = (String) props.get(i++);
		this.research = (String) props.get(i++);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getArchivements() {
		return archivements;
	}
	public void setArchivements(String archivements) {
		this.archivements = archivements;
	}
	public String getResearch() {
		return research;
	}
	public void setResearch(String research) {
		this.research = research;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
}
