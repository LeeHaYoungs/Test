package practice1;

public class StringTest {

	public static void main(String[] args) {
		
		String str ="";
		String str1 = "Hi everybody";
		String str2="Have a nice Day!";
		
		str = str1+" " +str2;
		System.out.println(str);
		
		System.out.println("str1의 글자수 : "+str1.length());
		System.out.println("str1 d글자 위치 : "+str1.indexOf("d"));
		System.out.println("str1 모두 소문자로 변환 : " + str1.toLowerCase());
		System.out.println("str1 모두 대문자로 변환 : "+ str1.toUpperCase());
		
		System.out.println("str2의 글자수 :"+str2.length());
		System.out.println("str2 a글자 위치 : "+str2.indexOf("l"));
		System.out.println("str2 모두 소문자로 변환 : "+str2.toLowerCase());
		System.out.println("str2 모두 대문자로 변환 : "+str2.toUpperCase());
	
	}

}
