package gameProject.classes;

import java.util.ArrayList;
import java.util.List;

import gameProject.entities.Campaign;
import gameProject.interfaces.CampaignService;

public class CampaignManager implements CampaignService {

	
	List<Campaign> campaigns =  new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {

		System.out.println("kampanya basarıyla eklendi :" + campaign.getCampaignName());
	}

	@Override
	public void remove(Campaign campaign) {
         
		System.out.println(campaign.getCampaignName() + "adlı kampanya silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "adlı kampanya güncellendi");
		
	}

	@Override
	public List<Campaign> getAll() {

		return this.campaigns;
	}

}
