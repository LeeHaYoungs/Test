package practice1;

public class ArrayCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.print("��� 1(for��) - ����� arr2�迭 : ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println(" ");
		System.out.println("��� 2(for-each�� = Enhanced for Loop)-");
		System.out.print("����� arr2�迭 : ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.println("====================================");
		
		arr2[3]=0;//arr2�� ��Ұ��� ����
		System.out.print("������ arr1 : ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		System.out.print("arr2�� ��Ұ��� ���� : ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}

}
