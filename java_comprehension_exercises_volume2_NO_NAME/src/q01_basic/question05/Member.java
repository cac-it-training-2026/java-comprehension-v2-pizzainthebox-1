package q01_basic.question05;
//1 Member クラス：下記クラス構成を参照しフィールド定義する。

//2 Member クラス：各フィールドの getter,setter メソッドを定義する。
//3 Member クラス：引数なしのコンストラクタを定義する。
//4 Member クラス：コンストラクタを定義する。引数で取得した id、password、name、age、rank を各フィールドに代入す
//る。
//5 Member クラス：buyItem メソッドをオーバーライドする。商品購入メッセージを出力する。出力例を参考に実装すること。
//6 Member クラス：showMember メソッドをオーバーライドする。フィールドの値を出力する。出力例を参考に実装するこ
//と。

public class Member extends AbstMember {
	protected String name;
	private int age;
	private int rank;
	private int id;
	private String password;

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

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return passward
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param passward セットする passward
	 */
	public void setPassword(String passward) {
		this.password = passward;
	}

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

	}

	@Override
	public void showMember() {
		//		---SHOW MEMBERS---
		//		***MEMBER DATA***
		//		Sato Kensuke is a non-member
		//		*****************
		//		***MEMBER DATA***
		//		id:1
		//		password:Passw0rd
		//		name:Miura Manabu
		//		age:28
		//		rank:2
		//		*****************
		System.out.println("---SHOW DATA(" + name + ")---");
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("passward:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");

	}

	@Override
	public void buyItem() {
		//		---BUY ITEM---
		//		Sato Kensuke purchased the item at a fixed price
		//		Miura Manabu purchased the item at 50% off
		System.out.println(name + "purchased the item at 50％ off");

	}
}
