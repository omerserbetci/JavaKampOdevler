package Ders4_Odev3;

public class MemberCheckManager implements IMemberCheckService{

	public boolean CheckIfRealPerson(Member member) {
		if(!member.getFirstName().isEmpty() && !member.getNationalityNumber().isEmpty()) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
