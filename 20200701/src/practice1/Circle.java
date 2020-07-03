package practice1;

public class Circle implements Cloneable { //추상클래스 Cloneable이기 때문에 상속해야함 
	
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		this.point=new Point(x,y);
		this.radius=radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {  //추상클래스 Cloneable이기 때문에 오버라이딩후 손대며 안됨
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {  //추상클래스 Cloneable이기 때문에 재정의해야함
		return "원점은 "+ point+"반지름은 "+radius+"입니다";
	}
	
	
	
	
}
