package practice1;

public class SmartPhone {
	private String company;
	private String os;
	
	SmartPhone(String company, String os){
		this.company=company;
		this.os=os;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return company+", "+os;
	}
	
}
