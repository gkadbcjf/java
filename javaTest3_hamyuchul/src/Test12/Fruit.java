package Test12;

import java.util.Properties;

public class Fruit {
	private String name;
	private int price;
	private int quanitity;
	
	
	public Fruit() {
		super();
	}


	public Fruit(String name, int price, int quanitity) {
		super();
		this.name = name;
		this.price = price;
		this.quanitity = quanitity;
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


	@Override
	public String toString() {
		return  name + "," + price + "원," + quanitity +"개";
	}
	
	
	
}
