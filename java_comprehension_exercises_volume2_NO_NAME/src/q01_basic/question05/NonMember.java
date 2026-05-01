
package q01_basic.question05;
//7 NonMember クラス：コンストラクタを定義する。引数で取得した name をフィールドに代入する。

//8 NonMember クラス：buyItem メソッドをオーバーライドする。商品購入メッセージを出力する。出力例を参考に実装するこ
//と。
//9 NonMember クラス：showMember メソッドをオーバーライドする。フィールドの値を出力する。出力例を参考に実装するこ
//と。

public class NonMember extends AbstMember {
	String name;

	/**
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public NonMember(String name) {

		this.name = name;

	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(this.name + "is a non-member");
		System.out.println("*****************");

	}

	//	***MEMBER DATA***
	//	Sato Kensuke is a non-member
	//	*****************
	@Override
	public void buyItem() {
		System.out.println(name + "purchased the item at a fixed price");

	}

}
//---SHOW MEMBERS---
//***MEMBER DATA***
//Sato Kensuke is a non-member
//*****************
//***MEMBER DATA***
//id:1
//password:Passw0rd
//name:Miura Manabu
//age:28
//rank:2
//*****************
//---BUY ITEM---
//Sato Kensuke purchased the item at a fixed price
//Miura Manabu purchased the item at 50% off