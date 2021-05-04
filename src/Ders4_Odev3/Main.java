package Ders4_Odev3;

public class Main {

	public static void main(String[] args) {

		MemberManager memberManager = new MemberManager(new MemberCheckManager());
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();

		Member member1 = new Member(1, "Omer", "Serbetci", "32296576730");
		member1.setDateOfBirth(7, 1, 1996);

		memberManager.inquireMember(member1);

		System.out.println("-------------------------------");

		memberManager.signUp(member1, "omerserbetci", "12345");

		System.out.println("-------------------------------");

		memberManager.signIn(member1, "omerserbetci", "12345");

		System.out.println("-------------------------------");

		memberManager.updateMember(member1, "Omer Yigit", "Serbetci", "32296576730");

		System.out.println("-------------------------------");

		memberManager.inquireMember(member1);

		System.out.println("-------------------------------");

		Game game1 = new Game();
		game1.id = 1;
		game1.name = "GTA 5";
		game1.campaing = null;
		
		Campaign campaign1 = new Campaign(1, "%10 OFF", false);
		
		campaignManager.addCampaign(campaign1);
		
		campaignManager.addCampaignToGame(campaign1, game1);
		
		gameManager.purchaseGame(game1, member1);
		
		memberManager.deleteMember(member1);
		
		
	}
}
