package q01_basic.question05;
//10 MemberManager クラス：引数なしでアクセス修飾子は private のコンストラクタを定義し、インスタンス化を禁止する

//11 MemberManager クラス：showAllMembers メソッドを static メソッドとして定義する。引数の Member 配列を拡張 for 文で
//オブジェクトを 1 件ずつ取得し、各オブジェクトの showMember メソッドを呼び出す。

public class MemberManager {

	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember m : members)

		{
			m.showMember();
		}

	}

}
