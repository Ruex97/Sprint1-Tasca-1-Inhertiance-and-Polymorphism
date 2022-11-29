package nivell3;

public class F1News extends News{
	private String team;
	
	public F1News(String headline, String text, String team) {
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
	
	// Class methods
	
    public double calculatePrice() {
		double price = 100;
		if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")){
			price += 50;
		}
		return price;	
	}
		
	public int calculateMark() {
		int mark = 4;
		if (team.equalsIgnoreCase("Ferrari") || team.equalsIgnoreCase("Mercedes")){
			mark += 2;
		}
		return mark;
		
	}
		

}
