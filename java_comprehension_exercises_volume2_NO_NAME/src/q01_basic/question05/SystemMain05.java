package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {
		NonMember member1 = new NonMember("Stou Kensuke");
		Member member2 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);
		//***MEMBER DATA***
		//id:1
		//password:Passw0rd
		//name:Miura Manabu
		//age:28
		//rank:2
		//*****************

		AbstMember[] members = { member1, member2 };

		//TODO ここから実装する
		MemberManager.showAllMembers(members);

	}

}
