package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable 
		String javastr = new String("java");
		System.out.println("javastr�� �޸� �ּ� : " + System.identityHashCode(javastr));
		
		//String���κ��� StringBuilder�� ��ü�� ����
		StringBuilder buffer = new StringBuilder(javastr);
		System.out.println(buffer);
		
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append(" android");
		buffer.append(" programming is fun! ");
		System.out.println(buffer);
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		
		javastr=buffer.toString();
		System.out.println(javastr);
		System.out.println("���� ������� javastr�� �޸� �ּ� : " + System.identityHashCode(javastr));
		
	}

}
