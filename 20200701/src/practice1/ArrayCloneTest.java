package practice1;

public class ArrayCloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2=arr1.clone();
		
		System.out.print("방법 1(for문) - 복사된 arr2배열 : ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println(" ");
		System.out.println("방법 2(for-each문 = Enhanced for Loop)-");
		System.out.print("복사된 arr2배열 : ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.println("====================================");
		
		arr2[3]=0;//arr2의 요소값을 변경
		System.out.print("변경후 arr1 : ");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		System.out.print("arr2의 요소값을 변경 : ");
		for(int i:arr2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
	}

}
