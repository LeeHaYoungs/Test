package pk23;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 인스턴스는 각각의 heap메모리에 저장됨
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		//문자열은 상수값으로 데이터영역에 고정된 주소를 사용 --> 상수풀에 저장
		String str3 = "abc";
		String str4 = "abc";
	}

}
