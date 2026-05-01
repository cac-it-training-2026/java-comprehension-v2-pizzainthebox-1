package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する

		Member a = new Member();
		a.name = "Miura Manabu";
		a.age = 24;
		a.rank = 1;

		Member b = new Member();
		b.name = "Sato Kensuke";
		b.age = 36;
		b.rank = 2;

		a.showMember();
		b.showMember();
	}

}
