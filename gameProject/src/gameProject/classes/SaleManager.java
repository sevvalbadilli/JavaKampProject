package gameProject.classes;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.interfaces.SaleService;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {

		System.out.println(game.getName() + "isimli oyun " +  gamer.getUserName() + "adlı kullanıcıya satıldı");
	}

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {

		double newPrice = game.getPrice() -  ( game.getPrice() * ((double) campaign.getDiscount() / 100));
		System.out.println(game.getName() + " isimli oyun " + gamer.getUserName() + " kullanıcı isimli oyuncuya " + campaign.getCampaignName() +" kampanyası ile " + newPrice +"TL'ye satıldı.");

	}

}
