package Ders4_Odev3;

public class GameManager {

	public void purchaseGame(Game game, Member member) {
		System.out.println(member.getUserName() + " purschased the " + game.name);
	}

}
