package gameDemo;

public class CampaingManager implements CampaingService {
	
	
  

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "" + "isimli kampanya eklendi.");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "" + "isimli kampanya silindi.");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName() + "" + "isimli kampanya güncellendi.");
		
		
	}

}
