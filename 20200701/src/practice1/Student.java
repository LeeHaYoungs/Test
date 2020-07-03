package practice1;

public class Student {
	int studentId;
	String studentName;

	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	//hash : ��ü
	//hashcode : ��ü �ּ�
	//heap : �޸� �ּ�
	
	@Override
	public int hashCode() { 
		return studentId;
	}

	@Override
	// �������� ���� ���ִ� �޼ҵ�
	public boolean equals(Object obj) {   //equals ���� ������ �߻��� �� ����
		//instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ� 
		if(obj instanceof Student){ //Student�� ���ǵ��� �ʾҴٸ� �ٷ� return false�� �ۼ��Ѵ�.
			//�ٿ�ĳ���� : �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			Student std = (Student)obj; // �θ� -> �ڽ�
			if(studentId == std.studentId)
				return true;
			else {
				return false;
			}
		}
		return false;
	}
	
}
