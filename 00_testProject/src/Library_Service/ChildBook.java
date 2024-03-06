package Library_Service;

public class ChildBook extends ParentBook{
	public ChildBook(String title, int price) {
		super(title,price);
	}
	public void print() {
		super.print();
		System.out.println("자식클래스");
	}
}
