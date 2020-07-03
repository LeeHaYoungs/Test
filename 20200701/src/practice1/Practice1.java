package practice1;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		Double num1,num2;
		char ch='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("값1")); //입력받는 메소드
		num2=Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(ch)) {
			System.out.println(ch+"문자아님");
		}
		else
			System.out.println(ch+"문자");
		
	}

}
