package nivell3;

public class FootballNews extends News{
	private String league;
	private String club;
	private String player;
	
	public FootballNews(String headline, String text, String league, String club, String player) {
		super(headline, text);
		this.league = league;
		this.club = club;
		this.player = player;
		price = calculatePrice();
		mark = calculateMark();
	}

	public String getLeague() {
		return league;
	}
	public String getClub() {
		return club;
	}
	public String getPlayer() {

		return player;
	}
	public void setLeague(String league) {
		this.league = league;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	// Class methods
	


	public double calculatePrice() {
		// Initial price is 300
		double price = 300;
		
		//I check if players, club or league increase the value of our new
		
			if (league.equalsIgnoreCase("Champions League")) {
				price += 100;				
			} 
			if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("madrid")) {
				price += 100;
			}	
			if (player.equalsIgnoreCase("ferran torres") || player.equalsIgnoreCase("Benzema")) {
				price += 50;
			}
		return price;	
	}
		//I check if players, club or league increase the mark of our new. I consider that a new can't talk of both leagues simultaneously.
	public int calculateMark() {
		int mark = 5;
		if (league.equalsIgnoreCase("Champions League")) {
			mark += 3;				
		} else if (league.equalsIgnoreCase("Champions League")){
			mark += 2;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("madrid")) {
			mark += 1;
		}	
		if (player.equalsIgnoreCase("ferran torres") || player.equalsIgnoreCase("Benzema")) {
			mark += 1;
		}
		return mark;
		
	}
	
}


