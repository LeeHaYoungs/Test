package practice1;

import javax.swing.JOptionPane;

public class Practice1 {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		Double num1,num2;
		char ch='A';
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1")); //�Է¹޴� �޼ҵ�
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		
		if(num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(ch)) {
			System.out.println(ch+"���ھƴ�");
		}
		else
			System.out.println(ch+"����");
		
	}

}
