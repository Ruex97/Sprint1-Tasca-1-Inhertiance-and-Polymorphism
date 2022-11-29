package nivell3;

public abstract class News implements NewsCalculations {
	protected String headline;
	protected String text;
	protected int mark;
	protected double price;
	
	public News(String headline, String text) {
		this.headline = headline;
		this.text = text;
		mark = 0;
		price = 0;
	}
	
	// Getters and setters
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getMark() {
		return mark;
	}
	public double getPrice() {
		return price;
	}
	
	
}
