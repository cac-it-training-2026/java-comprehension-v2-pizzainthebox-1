package q02_advanced.question01;

public class SystemMain01 {

	public static void main(String[] args) {
		//		12 SystemMain01 クラス：main メソッド内に以下の内容を記述する。
		//12.1 Member クラスオブジェクトを 2 つ生成する。コンストラクタを使用して id、password、name、age、rank、coupons
		//		フィールドに値を代入する。
		//		12.2 各生成オブジェクトの showMember メソッドを呼び出し、ユーザー情報を出力する。

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		Member member1 = new Member(23, "osu", "花山薫", 17, 3);
		Member member2 = new Member(19, "ks", "範馬刃牙", 89, 2);

		member1.showMember();
		member2.showMember();

	}

}
