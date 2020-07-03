package pk23;

public class StBufferTest {
	//String -> 고정
			//StringBuffer -> 동기화
			//StringBuilder -> 동기화를 제공하지 않는다
			//동기화 : 순서
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		StringBuffer buf = new StringBuffer("Nice Day!");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi!^^ ");
		buf.insert(15, "Everybody");
		System.out.println(buf);
		buf.delete(0, 5);
		System.out.println(buf);
	}

}
