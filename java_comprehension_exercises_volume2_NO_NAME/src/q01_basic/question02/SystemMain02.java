package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member a = new Member();

		a.getName();
		a.setName("Miura Manabu");

		a.getAge();
		a.setAge(30);

		a.getRank();
		a.setRank(1);
		a.rankUp();

		a.showMember();

	}
}
