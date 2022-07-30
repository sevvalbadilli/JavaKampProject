package gameProject.interfaces;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface SaleService {
	
	void sale(Gamer gamer, Game game);
	void sale(Gamer gamer, Game game , Campaign campaign);

}
