package practice1;

public class Circle implements Cloneable { //�߻�Ŭ���� Cloneable�̱� ������ ����ؾ��� 
	
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.point=new Point(x,y);
		this.radius=radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {  //�߻�Ŭ���� Cloneable�̱� ������ �������̵��� �մ�� �ȵ�
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {  //�߻�Ŭ���� Cloneable�̱� ������ �������ؾ���
		return "������ "+ point+"�������� "+radius+"�Դϴ�";
	}
	
	
	
	
}
