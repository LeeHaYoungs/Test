package practice1;

public class SystemTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		
		int sum=0;
		for(int i=0;i<10000;i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1~10000�� �� : "+sum);
		System.out.println("��꿡 "+ (time2-time1)+" �����ʰ� �ҿ�Ǿ���. ");
	}

}
