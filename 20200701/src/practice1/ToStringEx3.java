package practice1;

class Bk{
	int bookNumber;
	String bookTitle;
	
	Bk(int bookNumber, String bookTitle){
		this.bookNumber =bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber+", "+bookTitle;
	}
	
	
}
public class ToStringEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bk bk = new Bk(10,"java");
		System.out.println(bk);
		
	}

}
