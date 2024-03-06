package Library_Service;

public class ParentBook {
	String title;
	int price;
	
	public ParentBook(String title, int price) {
		this.title=title;
		this.price=price;
	}
	public void print() {
		System.out.println("책 제목 가격 : " + title + ", " + price);
	}
		
	
}
