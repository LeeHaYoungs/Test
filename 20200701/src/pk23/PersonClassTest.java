package pk23;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//��ü�� �����ؼ� Ŭ�����̸� ȹ��
		Person person = new Person("ȫ�浿",40);
		Person person1 = new Person("ȫ�浿");
		
		//Object�� getClass() �޼ҵ带 ���
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//Ŭ������ �����ؼ� Ŭ���� �̸��� ȹ��
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("pk23.Person");
		System.out.println(pClass3.getName());
	}

}
