package pk23;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//객체를 생성해서 클래스이름 획득
		Person person = new Person("홍길동",40);
		Person person1 = new Person("홍길동");
		
		//Object의 getClass() 메소드를 사용
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//클래스가 접근해서 클래스 이름을 획득
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("pk23.Person");
		System.out.println(pClass3.getName());
	}

}
