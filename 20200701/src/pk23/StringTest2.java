package pk23;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String javastr = new String("java");
		String androidstr = new String("android");
		
		System.out.println(javastr);
		System.out.println("ó�� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		
		javastr = javastr.concat(androidstr);
		System.out.println("concat�� ���ڿ�");
		System.out.println(javastr);
		System.out.println("ó�� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		
		//String -> ����
		//StringBuffer -> ����ȭ
		//StringBuilder -> ����ȭ�� �������� �ʴ´�
		//����ȭ : ����
	}
}
