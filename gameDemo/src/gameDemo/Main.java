package gameDemo;



public class Main {

	public static void main(String[] args)  {
		
		 Gamer gamer = new Gamer(1,"Aybike","Kocak",1998,11111);
		 GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
	  
		
		 gamerManager.add(gamer);
     
		Game game = new Game(1,"Oyun1",50);
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		System.out.println("--------------");
		
		Campaing campaing = new Campaing("Yaz Kampanyasi",0.4);
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(campaing);
		System.out.println("--------------");
		
		OrderManager orderManager = new OrderManager(campaingManager);
		orderManager.orderWithCampaing(gamer,campaing);
		orderManager.order(gamer, game);
		
		
		
		
		
		

	}

}
