package practice1;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVal1=new String("이호진");
		String strVal2="이호진";
		
		//물리적비교
		if(strVal1 == strVal2){
			System.out.println("같은 String 객체를 참조");
		}//논리적비교
		else if(strVal1.equals(strVal2)) {
			System.out.println("같은 문자열");
		}
		else {
			System.out.println("다른 String 객체를 참조");
		}

	}

}
