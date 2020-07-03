package practice1;

public class Student {
	int studentId;
	String studentName;

	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	//hash : 객체
	//hashcode : 객체 주소
	//heap : 메모리 주소
	
	@Override
	public int hashCode() { 
		return studentId;
	}

	@Override
	// 논리적으로 같게 해주는 메소드
	public boolean equals(Object obj) {   //equals 사용시 오류가 발생할 수 있음
		//instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단 
		if(obj instanceof Student){ //Student가 정의되지 않았다면 바로 return false를 작성한다.
			//다운캐스팅 : 부모클래스 객체가 자식클래스 객체로 형번환
			Student std = (Student)obj; // 부모 -> 자식
			if(studentId == std.studentId)
				return true;
			else {
				return false;
			}
		}
		return false;
	}
	
}
