package pk23;

public class StBufferTest {
	//String -> ����
			//StringBuffer -> ����ȭ
			//StringBuilder -> ����ȭ�� �������� �ʴ´�
			//����ȭ : ����
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
