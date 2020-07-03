package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable 
		String javastr = new String("java");
		System.out.println("javastr의 메모리 주소 : " + System.identityHashCode(javastr));
		
		//String으로부터 StringBuilder의 객체를 생성
		StringBuilder buffer = new StringBuilder(javastr);
		System.out.println(buffer);
		
		//연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append(" android");
		buffer.append(" programming is fun! ");
		System.out.println(buffer);
		System.out.println("연산 후 buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("새로 만들어진 javastr의 메모리 주소 : " + System.identityHashCode(javastr));
		
	}

}
