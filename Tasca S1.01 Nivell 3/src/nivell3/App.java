package nivell3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Editorial newYorkTimes = new Editorial();
		int option = -1;
		do {
option = typeInteger("What do you want to do? \n\n1.- Enter editor. \n2.- Delete editor.\n"
					+ "3.- Create news and assgin it to an editor.\n4.- Delete news"
					+ "\n5.- Show all news from an editor \n6.- Calculate the mark of a news"
					+ "\n7.- Calculate the price-news ratio" + "\n0.- Quit.");
			menu(option, newYorkTimes);
		} while (option != 0);
	}
	
	// -------- Functionality methods -------
	
	static void hireEditor(String name, String id, Editorial newYorkTimes) {
		Editor editor1 = new Editor(name, id);
		newYorkTimes.getEditors().add(editor1);
	}
	
	static void deleteEditor(String name, Editorial newYorkTimes) {
		int editor = whereIsInEditors(name, newYorkTimes);
		System.out.println("Editor deleted");
		newYorkTimes.getEditors().remove(editor);
	}
	
	static News createSportNews() {
		String headline, text, league, club, player, tournament, team;
		News news = null;
		int option = -1;
		while (option < 0 || option > 5) {
			option = typeInteger("What sports does your new belongs to? \n\n1.- Football \n2.- Basketball \n"
					+ "3.- Tennis .\n4.- F1" + "\n5.- Motorcycle" + "\n0.- Quit.");
		}
			
		switch(option) {
			case 1:
				headline = typeString("Introduce the headline of the news");
				text = typeString("Introduce the text of the news");
				league = typeString("About which league is talking our new");
				player = typeString("About which player is talking our new");
				club = typeString("About which club is talking our new");
				FootballNews myNews = new FootballNews(headline, text, league, club, player);
				news = myNews;
				break;
			case 2:
				headline = typeString("Introduce the headline of the news");
				text = typeString("Introduce the text of the news");
				league = typeString("about which league is talking our new");
				club = typeString("about which club is talking our new");
				BasketballNews myNews2 = new BasketballNews(headline, text, league, club);
				news = myNews2;
				break;
			case 3:
				headline = typeString("Introduce the headline of the news");
				text = typeString("Introduce the text of the news");
				tournament = typeString("about which tournament is talking our new");
				player = typeString("about which player is talking our new");
				TennisNews myNews3 = new TennisNews(headline, text, tournament, player);
				news = myNews3;
				break;
			case 4:
				headline = typeString("Introduce the headline of the news");
				text = typeString("Introduce the text of the news");
				team = typeString("about which team is talking our new");
				F1News myNews4 = new F1News(headline, text, team);
				news = myNews4;
				break;
			case 5:
				headline = typeString("Introduce the headline of the news");
				text = typeString("Introduce the text of the news");
				team = typeString("about which team is talking our new");
				MotorcycleNews myNews5 = new MotorcycleNews(headline, text, team);
				news = myNews5;
				break;
			default: 
				System.out.println("You have to introduce a number between 0 and 5 to work");
				
		}
		return news;
	}
	
	static void addNewsToEditor(String editorsName, News myNews, Editorial newYorkTimes) {
		// I look for a coincidence in name, if so, I add the news to the editor. else if condition checks that if we end up
		// our loop without any coincidence, we don't have editors. Even if the coincidence is in last position or ArrayList, 
		// which would fulfill the condition of else if, first it would fulfill the if condition.
		for (int i=0; i<newYorkTimes.getEditors().size(); i++) {
			if (editorsName.equalsIgnoreCase(newYorkTimes.getEditors().get(i).getName())) {
				newYorkTimes.getEditors().get(i).getNews().add(myNews);
			} else if (i == newYorkTimes.getEditors().size() - 1) {
				System.out.println("We don't have any editor with this name in our editorial");
			}
		}
	}

	
	// ----- Support Methods -----
	
	static String typeString(String str) {
	    Scanner input = new Scanner(System.in);
		System.out.println(str);
		String sentence = input.nextLine();
		return sentence;
	}
	
	static int typeInteger(String str) {
	    Scanner input = new Scanner(System.in);
		System.out.println(str);
		int value = input.nextInt();
		return value;
	}
	
	static int whereIsInNews(int editor, String headline, Editorial newYorkTimes) {
		boolean trobat = false;
		int i = -1;
		int index = 0;
		 do {
			 if (newYorkTimes.getEditors().get(editor).getNews().get(index).getHeadline().equalsIgnoreCase(headline)) {
				 trobat = true;
				 i = index;
				} else {
					index++;
				}
		 } while (index < newYorkTimes.getEditors().size() && trobat == false);
			
		return i;
	}
	
	
	static int whereIsInEditors (String name, Editorial newYorkTimes) {
		boolean trobat = false;
		int i = -1;
		int index = 0;
		 do {
			 if (name.equals(newYorkTimes.getEditors().get(index).getName())) {
				 trobat = true;
				 i = index;
				} else {
					index++;
				}
		 } while (index < newYorkTimes.getEditors().size() && trobat == false);
			
		return i;
	}
	
	static void deleteNews(int editor, int news, Editorial newYorkTimes) {
		newYorkTimes.getEditors().get(editor).getNews().remove(news);
	}
	
	// ---- Menu ----
	static void menu(int x, Editorial newYorkTimes) {
		String name, id, headline;
		int editorsIndex, newsIndex, mark;
		double price;
		
		switch(x) {
			case 1:
				name = typeString("Tell me editor's name");
				id = typeString("Tell me editor's id");
				hireEditor(name, id, newYorkTimes);
				break;
			case 2:
				// I just delete editors by its name, not name and id. IRL i would search them by its id
				name = typeString("Tell me editor's id you want to fire");
				deleteEditor(name, newYorkTimes);
				break;
			case 3:
				// I create the news of its corresponding type, and assign id to editor.
				News myNews = createSportNews();
				name = typeString("Tell me which editor will work with this news");
				addNewsToEditor(name, myNews, newYorkTimes);
				break;
			case 4:
				// First i find the editor, then i find the new. 
				name = typeString("Tell me which editor has the news"); 
				editorsIndex = whereIsInEditors(name, newYorkTimes);
				headline = typeString("Tell me (excatly) the headline of the new");
				newsIndex = whereIsInNews(editorsIndex, headline, newYorkTimes);
				deleteNews(editorsIndex, newsIndex, newYorkTimes);
				break;
			case 5:
				name = typeString("Tell me which editor has the news"); 
				editorsIndex = whereIsInEditors(name, newYorkTimes);
				System.out.println(newYorkTimes.getEditors().get(editorsIndex).showNews());
				break;
			case 6: 
				name = typeString("Tell me which editor has the news"); 
				editorsIndex = whereIsInEditors(name, newYorkTimes);
				headline = typeString("Tell me (excatly) the headline of the new");
				newsIndex = whereIsInNews(editorsIndex, headline, newYorkTimes);
				mark = newYorkTimes.getEditors().get(editorsIndex).getNews().get(newsIndex).getMark();
				System.out.println("The mark of this new is " + mark);
				break;
			case 7: 
				name = typeString("Tell me which editor has the news"); 
				editorsIndex = whereIsInEditors(name, newYorkTimes);
				headline = typeString("Tell me (excatly) the headline of the new");
				newsIndex = whereIsInNews(editorsIndex, headline, newYorkTimes);
				price = newYorkTimes.getEditors().get(editorsIndex).getNews().get(newsIndex).getPrice();
				System.out.println("The price of this new is " + price);
				break;
			default: 
				System.out.println("Something went wrong!");
			
		}
		
	}

}
