package Ders4_Odev3;

public class CampaignManager {

	public void addCampaign(Campaign campaign) {
		if(campaign != null) {
			campaign.isValid = true;
			System.out.println("Campaign added.");
		}
	}
	
	public void addCampaignToGame(Campaign campaign, Game game) {
		if(campaign != null && game != null) {
			game.campaing = campaign;
			System.out.println(campaign.campaignName + "added to " + game.name);
		}
	}
	
	public void removeCampaignToGame(Campaign campaign, Game game) {
		if(game.campaing != null && game.campaing == campaign) {
			game.campaing = null;
			System.out.println(campaign.campaignName + "removed from " + game.name);
		}
	}
	
}
