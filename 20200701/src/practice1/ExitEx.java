package practice1;

public class ExitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);//프로젝트를 종료
				break;//for문에 대한 종료, 종료가 출력됨
			}
		}
		System.out.println("종료");
	}

}
