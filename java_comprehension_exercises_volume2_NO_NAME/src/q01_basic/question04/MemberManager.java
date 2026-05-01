package q01_basic.question04;

class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	public static void showAllMembers(Member[] members) {
		// 拡張for文：配列の中身を1つずつ「m」に取り出してループする
		for (Member m : members) {
			// 取り出した Member オブジェクトのメソッドを呼び出す
			m.showMember();
		}
	}

	//TODO showAllMembersメソッドを実装する

}
