package nivell3;

public class TennisNews extends News{
	private String tournament;
	private String player;
		
	public TennisNews(String headline, String text, String tournament, String player) {
		super(headline, text);
		this.tournament = tournament;
		this.player = player;
		price = calculatePrice();
		mark = calculateMark();
			
	}

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	// Class methods
	
	public double calculatePrice() {
	
		double price = 150;
		
		if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") 
			|| (player.equalsIgnoreCase("Djokovic"))){
			price += 100;
		}
		return price;	
	}
		
	public int calculateMark() {
		int mark = 4;
		if (player.equalsIgnoreCase("Federer") || player.equalsIgnoreCase("Nadal") 
			|| (player.equalsIgnoreCase("Djokovic"))){
			mark += 3;
		}
		return mark;
		
	}
		

}
