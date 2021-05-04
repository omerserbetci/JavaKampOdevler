package Ders4_Odev3;

public class MemberManager {
	
	IMemberCheckService checkService;

	public MemberManager(IMemberCheckService checkService) {
		
		this.checkService = checkService;
	}
	
	public void signUp(Member member, String userName, String password) {
		if(checkService.CheckIfRealPerson(member)) {
			System.out.println(member.getFirstName() + " signed up!");
			member.setMember(true);
			member.setUserName(userName);
			member.setPassword(password);
		} else {
			System.out.println("Check your information!!!");
		}
	}
	
	public void signIn(Member member, String userName, String password) {
		if(member != null && member.isMember() == true) {
			if(member.getUserName() == userName && member.getPassword() == password) {
				System.out.println("Signed in!" + member.getUserName());
			} else {
				System.out.println("Wrong user name or password!");
			}
		} else {
			System.out.println("Member coulnt found!");
		}
	}
	
	public void updateMember(Member member, String firstName, String lastName, String nationalityNumber) {
		if(member.isMember() && !firstName.isEmpty() && !lastName.isEmpty() && !nationalityNumber.isEmpty()) {
			member.setFirstName(firstName);
			member.setLastName(lastName);
			member.setNationalityNumber(nationalityNumber);
			System.out.println("Member has updated.");
		} else {
			System.out.println("Member coulnt updated!");
		}
	}
	
	public void deleteMember(Member member) {
		if(member != null && member.isMember()) {
			member.setMember(false);
			System.out.println("Account deleted.");
		} else {
			System.out.println("Account coldnt found!");
		}
	}
	
	public void inquireMember(Member member) {
		if (member != null) {
			System.out.println(
				"Name: " + member.getFirstName() +
				"\nSurname: " + member.getLastName() +
				"\nNationlity Number: " + member.getNationalityNumber() +
				"\nBirth Date: " + member.getDateOfBirth().getTime());
		}
		
	}
}
