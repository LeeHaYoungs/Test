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
		// �θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if (obj instanceof Key) {
			Key key = (Key) obj;
			//�ٿ�ĳ�������� obj�� KeyŬ������ compareKey�� ����
			if (number == key.number) {
				return true; // true���� ��ȯ�ؾ� String���� �����´�
			} else {
				return false;
			}
		}
		return false;
	}

}
