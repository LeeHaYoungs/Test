package practice1;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Boxing �⺻Ÿ�� = ��ü
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		//Integer obj3 = new Integer.valueOf(100);
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(obj1);
		System.out.println(value1);
		System.out.println(obj2);
		System.out.println(value2);
	}

}
