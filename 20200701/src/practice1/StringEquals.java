package practice1;

public class StringEquals {
	
	public static void main(String[] args) {
		
		String str1 = new String("abs");
		String str2 = new String("abs");
		System.out.println("Stirng");
		//물리적비교
		//두String 인스턴스 주소값(heap)이 다름
		System.out.println(str1==str2);	
		//논리적비교
		//String클래스의  equals 메소드가 재정의 되어 논리적 값이 같음을 구현
		System.out.println(str1.equals(str2));	
		
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		Integer i3 = new Integer(100);
		System.out.println("Integer");
		//물리적비교
		//두String 인스턴스 주소값(heap)이 다름
		System.out.println(i1==i3);	
		System.out.println(i1==i2);	
		//논리적비교
		//String클래스의  equals 메소드가 재정의 되어 논리적 값이 같음을 구현
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i2));
	}	
}
