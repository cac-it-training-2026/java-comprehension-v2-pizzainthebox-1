package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		//TODO ここから実装する
		Member member1 = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);
		Member[] memberArray = { member1, member2 };

		MemberManager.showAllMembers(memberArray);

		//		id:1
		//		password:Passw0rd
		//		name:Miura Manabu
		//		age:28
		//		rank:2
		//		*****************
		//		***MEMBER DATA***
		//		id:2
		//		password:aaaAAA
		//		name:Sato Kensuke
		//		age:43
		//		rank:1
	}

}
