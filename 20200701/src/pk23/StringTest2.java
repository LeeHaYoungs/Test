package pk23;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String javastr = new String("java");
		String androidstr = new String("android");
		
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javastr));
		
		javastr = javastr.concat(androidstr);
		System.out.println("concat된 문자열");
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javastr));
		
		//String -> 고정
		//StringBuffer -> 동기화
		//StringBuilder -> 동기화를 제공하지 않는다
		//동기화 : 순서
	}
}
