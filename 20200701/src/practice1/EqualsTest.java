package practice1;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100,"�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		
		System.out.println("studentLee �� studentLee2");
		if(studentLee == studentLee2) {
			System.out.println("studentLee�� studentLee2��  �ּҴ� ����");
		}
		else {
			System.out.println("studentLee�� studentLee2��  �ּҴ� ���� �ʴ�");
		}
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee�� studentLee2�� �����ϴ�");
		}
		else {
			System.out.println("studentLee�� studentLee2�� ���������ʴ�");
		}
		
		System.out.println("studentLee �� studentSang");
		if(studentLee == studentSang) {
			System.out.println("studentLee�� studentSang��  �ּҴ� ����");
		}
		else {
			System.out.println("studentLee�� studentSang��  �ּҴ� ���� �ʴ�");
		}
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee�� studentSang�� �����ϴ�");
		}
		else {
			System.out.println("studentLee�� studentSang�� ���������ʴ�");
		}
		//�ν��Ͻ� ������ ��������� heap �޸��ּ�
		System.out.println("studentLee�� hashcode �� : "+ studentLee.hashCode());
		System.out.println("studentSang�� hashcode �� : "+ studentSang.hashCode());
		//�ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� �����ּ� �� : "+ System.identityHashCode(studentLee));
		System.out.println("studentSang�� �����ּ� �� : "+ System.identityHashCode(studentSang));
	
	}

}
