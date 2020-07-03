package practice1;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Key객체를 식별키로 하여 String값을 저장하는 HashMap 객체 생성
		//Key = hashcode
		HashMap<Key, String>hashMap = new HashMap<Key, String>();
		
		//식별키(hashcode) put으로 입력
		hashMap.put(new Key(1), "홍길동");
		
		//식별키(hashcode)을 이용하여 값(String)을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}