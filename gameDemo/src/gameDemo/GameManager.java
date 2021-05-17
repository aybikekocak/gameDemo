package gameDemo;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " " + "oyun eklendi.");
		
	}

}
