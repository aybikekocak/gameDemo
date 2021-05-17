package gameDemo;

public class Campaing {
	private String campaingName;
	private double discount;
	public Campaing(String campaingName, double discount) {
		super();
		this.campaingName = campaingName;
		this.discount = discount;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
