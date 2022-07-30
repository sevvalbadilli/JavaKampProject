package gameProject;

import java.util.Date;

import gameProject.classes.CampaignManager;
import gameProject.classes.GameManager;
import gameProject.classes.GamerManager;
import gameProject.classes.SaleManager;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.interfaces.CampaignService;
import gameProject.interfaces.GameService;
import gameProject.interfaces.GamerService;
import gameProject.interfaces.SaleService;
import gameProject.utilities.EDevletValidationAdapter;

public class Main {

	public static void main(String[] args) {

		Game game = new Game(1, "Call of Duty", 250d);
		Game game2 = new Game(2, "Age Of Empires", 120d);

		Campaign campaign = new Campaign(1, "yılbaşına özel özel %5 indirim", 5);

		Gamer validPlayer = new Gamer(1, "Sevvalbdl", "Şevval", "Badıllı", new Date(2000, 1, 24), "12345678999");
		Gamer invalidPlayer = new Gamer(2, "engindemirog", "Engin", "Demirog", new Date(2005, 6, 28), "5555555555");

		
		GamerService  gamerService = new GamerManager(new EDevletValidationAdapter());
		gamerService.add(validPlayer);
		gamerService.add(invalidPlayer);
	
		GameService gameService = new GameManager();
	    gameService.add(game);
	
	    
	    CampaignService campaignService = new CampaignManager();
        campaignService.add(campaign);
        
        
        SaleService saleService = new SaleManager();
        saleService.sale( validPlayer,game);
        saleService.sale( validPlayer,game2,campaign);
	
	
	}
	

}
