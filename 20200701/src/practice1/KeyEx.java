package practice1;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Key��ü�� �ĺ�Ű�� �Ͽ� String���� �����ϴ� HashMap ��ü ����
		//Key = hashcode
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
		
		//�ĺ�Ű(hashcode) put���� �Է�
		hashMap.put(new Key(1), "ȫ�浿");
		
		//�ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}