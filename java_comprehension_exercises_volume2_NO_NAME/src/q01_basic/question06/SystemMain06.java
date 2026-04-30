package q01_basic.question06;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		
		try {System.out.println("input id>>");
		 int id=cr.inputNumber();
		 
		 
		 
		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("input password>>"+);
		//TODO ここから実装する

	}

}
//---CREATE MEMBER DATA---
//input id>>s
//error!
//java.lang.NumberFormatException: For input string: "s"
//at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//at java.base/java.lang.Integer.parseInt(Integer.java:668)
//at java.base/java.lang.Integer.parseInt(Integer.java:786)
//at q01_basic.question06.ConsoleReader.inputNumber(ConsoleReader.java:34)
//at q01_basic.question06.SystemMain06.main(SystemMain06.java:45