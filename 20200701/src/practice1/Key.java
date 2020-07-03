package practice1;

public class Key {
	public int number;
	public Key(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 부모객체와 자식객체가 형성되어서 형변환이 가능한지 판다
		if (obj instanceof Key) {
			Key key = (Key) obj;
			//다운캐스팅으로 obj가 Key클래스의 compareKey로 대입
			if (number == key.number) {
				return true; // true값을 반환해야 String값을 가져온다
			} else {
				return false;
			}
		}
		return false;
	}

}
