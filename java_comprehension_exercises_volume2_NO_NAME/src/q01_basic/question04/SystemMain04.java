package q01_basic.question04;
//12 SystemMain05 クラス：main メソッド内に以下の内容を記述する。

//12.1 NonMember クラスオブジェクトを生成し、コンストラクタを使用して name フィールドに値を代入する。
//AbstMember 型の配列に代入する。
//12.2 Member クラスオブジェクトを生成し、コンストラクタを使用して id、password、name、age、rank フィールドに値を
//代入する。AbstMember 型の配列に代入する。
//12.3 MemberManager クラスの showAllMembers メソッドを呼び出し、各生成オブジェクトのユーザー情報を出力する。
//12.4 各生成オブジェクトの buyItem メソッドを呼び出し、商品購入メッセージを出力する。

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
