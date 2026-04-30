package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */
	public String inputString() throws IOException {
		//TODO ここから実装する
		return reader.readLine();

	}
	//		7 ConsoleReader クラス：inputString メソッド内で、コンソール上の入力値を取得し、戻り値として返す。IOException を
	//		throws 宣言する。なお BufferedReader を用いること。
	//		8 ConsoleReader クラス：inputNumber メソッド内で、コンソール上の入力値を取得し、int 型に変換して戻り値として返す。
	//		IOException, NumberFormatException を throws 宣言する。なお BufferedReader を用いること。

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		String number = reader.readLine();
		return Integer.parseInt(number);

	}

}
