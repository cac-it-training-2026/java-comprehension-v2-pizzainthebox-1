package q02_advanced.question01;

public class Coupon {
	//	1 Coupon クラス：下記クラス構成を参照しフィールド定義する。
	//	2 Coupon クラス：各フィールドの getter,setter メソッドを定義する。
	private int id;
	private double discountRate;
	private String description;

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
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	//	3 Coupon クラス：引数なしのコンストラクタを定義する。
	public Coupon() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//	4 Coupon クラス：コンストラクタを定義する。引数で取得した id、discountRate、description を各フィールドに代入する。
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;

	}

	//	5 Coupon クラス：toString メソッドをオーバーライドする。クーポン情報の出力結果を設定する。なお Eclipse の toStirng の
	//	自動生成機能を用いてもよい。
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", discountRate=" + discountRate + ", description=" + description + "]";
	}

}
