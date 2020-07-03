package practice1;
class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
	}

	@Override   //안하면 오류남
	public String toString() {
		// TODO Auto-generated method stub
		return title+", "+author;
	}
	
	
}
public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("java","홍길동");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
		
	}

}
