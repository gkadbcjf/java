package Test4;

public class Product {
	private String name;
	private int price;
	private int quanitity;
	
	
	public Product() {
		super();
	}


	public Product(String name, int price, int quanitity) {
		super();
		this.name = name;
		this.price = price;
		this.quanitity = quanitity;
	}
	
	public String infomation() {
		return "상품명 : "+this.name +"\n가격 : " + this.price +"\n수량 : " +this.quanitity 
				;
	}


	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQuanitity() {
		return quanitity;
	}


	public void setQuanitity(int quanitity) {
		this.quanitity = quanitity;
	}
	
	
	
}
