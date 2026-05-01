package q02_advanced.question01;

import java.util.List;

public class Member {

	//	6 Member クラス：下記クラス構成、クラス図を参照しフィールド定義する。
	//	7 Member クラス：各フィールドの getter,setter メソッドを定義する。
	private int id;

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
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
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
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	//	8 Member クラス：引数なしのコンストラクタを定義する。
	public Member() {

	}

	//	9 Member クラス：コンストラクタを定義し、以下の内容を記述する。
	//	9.1 引数で取得した id、password、name、age、rank を各フィールドに代入する。
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		//	9.2 2 つの Coupon クラスオブジェクトを生成し、コンストラクタを使用して、id、discountRate、description フィールドに
		//	値を代入する。なお任意の値でよい。
		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");
		//	9.3 各生成オブジェクトを List 型の coupons フィールドに追加する。
		this.coupons = new java.util.ArrayList<>();
		this.coupons.add(coupon1);
		this.coupons.add(coupon2);

	}

	//	10 Member クラス：toString メソッドをオーバーライドする。ユーザー情報の出力結果を設定する。なお Eclipse の toStirng の
	//	自動生成機能を用いてもよい。
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	//	11 Member クラス：showMember メソッドを定義する。toString メソッドを引数に println を呼び出し、フィールドの値を出力
	//	し＊の区切り行を表示する。出力例を参考に実装すること。
	public void showMember() {
		System.out.println(toString());
		System.out.println("***********");

	}
	//	例 println(toString());
}
