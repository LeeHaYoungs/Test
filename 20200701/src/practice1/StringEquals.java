package practice1;

public class StringEquals {
	
	public static void main(String[] args) {
		
		String str1 = new String("abs");
		String str2 = new String("abs");
		System.out.println("Stirng");
		//��������
		//��String �ν��Ͻ� �ּҰ�(heap)�� �ٸ�
		System.out.println(str1==str2);	
		//������
		//StringŬ������  equals �޼ҵ尡 ������ �Ǿ� ���� ���� ������ ����
		System.out.println(str1.equals(str2));	
		
		Integer i1 = new Integer(100);
		Integer i2 = 100;
		Integer i3 = new Integer(100);
		System.out.println("Integer");
		//��������
		//��String �ν��Ͻ� �ּҰ�(heap)�� �ٸ�
		System.out.println(i1==i3);	
		System.out.println(i1==i2);	
		//������
		//StringŬ������  equals �޼ҵ尡 ������ �Ǿ� ���� ���� ������ ����
		System.out.println(i1.equals(i3));
		System.out.println(i1.equals(i2));
	}	
}
