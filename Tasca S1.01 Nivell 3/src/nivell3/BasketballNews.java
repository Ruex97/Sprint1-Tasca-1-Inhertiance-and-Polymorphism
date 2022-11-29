package nivell3;

public class BasketballNews extends News{
	private String league;
	private String club;
	
	public BasketballNews(String headline, String text, String league, String club) {
		super(headline, text);
		this.league = league;
		this.club = club;
		price = calculatePrice();
		mark = calculateMark();
	}

	public String getLeague() {
		return league;
	}
	public String getClub() {

		return club;
	}
	


	public void setLeague(String league) {
		this.league = league;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public double calculatePrice() {

		double price = 250;
		
			if (league.equalsIgnoreCase("Euro league")) {
				price += 75;				
			} 
			if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("madrid")) {
				price += 75;
			}	
		return price;	
	}
	

	public int calculateMark() {
		int mark = 4;
		if (league.equalsIgnoreCase("Euro league") ) {
			mark += 3;				
		} else if (league.equalsIgnoreCase("ACB")){
			mark += 2;
		}
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("madrid")) {
			mark += 1;
		}	
		return mark;
	}


}
