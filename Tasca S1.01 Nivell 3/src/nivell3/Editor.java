package nivell3;

import java.util.*;

public class Editor {
	private ArrayList <News> news;
	private String name;
	private final String id;
	private static double salary = 1500;
	
	public Editor (String name, String id) {
		this.name = name;
		this.id = id;
		news = new ArrayList<News>();
	}

	public ArrayList<News> getNews() {
		return news;
	}

	public void setNews(ArrayList<News> news) {
		this.news = news;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static double getSalary() { 
		return salary;
	}

	public static void setSalary(double salary) {
		Editor.salary = salary;
	}

	public String getId() {
		return id;
	}
	
	public String showNews() {
		String myNews = "";
		for (int i=1;i<=news.size();i++) {
			myNews += i + ".- " + news.get(i-1).getHeadline();
			myNews += "\n";
		}
		return "News of " + name + " are: " + myNews;
	}

	

	
}
