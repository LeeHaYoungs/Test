package practice1;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVal1=new String("��ȣ��");
		String strVal2="��ȣ��";
		
		//��������
		if(strVal1 == strVal2){
			System.out.println("���� String ��ü�� ����");
		}//������
		else if(strVal1.equals(strVal2)) {
			System.out.println("���� ���ڿ�");
		}
		else {
			System.out.println("�ٸ� String ��ü�� ����");
		}

	}

}
