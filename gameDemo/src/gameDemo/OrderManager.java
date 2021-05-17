package gameDemo;

public class OrderManager implements OrderService{
	CampaingManager campaingManager;

	public OrderManager(CampaingManager campaingManager) {
		this.campaingManager = campaingManager;
	}
	@Override
	public void order(Gamer gamer , Game game ) {
		System.out.println(gamer.getFirstName() + "," + game.getGameName() + " " + "satis isleminiz basarili.");
		
	}

	@Override
	public void orderWithCampaing(Gamer gamer,Campaing campaing) {
		campaingManager.add(campaing);
		
		
	}

}
