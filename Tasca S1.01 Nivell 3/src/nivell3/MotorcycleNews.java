package nivell3;

public class MotorcycleNews extends News{
	private String team;
	
	public MotorcycleNews(String headline, String text, String team) {
		super(headline, text);
		this.team = team;		
		price = calculatePrice();
		mark = calculateMark();
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	public double calculatePrice() {
		double price = 100;
		if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")){
			price += 50;
		}
		return price;	
	}
		//I check if players, club or league increase the mark of our new. I consider that a new can't speak of both leagues.
	public int calculateMark() {
		int mark = 3;
		if (team.equalsIgnoreCase("Honda") || team.equalsIgnoreCase("Yamaha")){
			mark += 3;
		}
		return mark;
		
	}
}
