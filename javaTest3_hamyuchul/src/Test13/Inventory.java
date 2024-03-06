package Test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName; 
	private Date putDate; //입고일
	private Date getDate;  // 출고일
	private int putAmout; //입고수량
	private int getAmount; //출고수량
	private int inventoryAmount; //재고수량
	public Inventory() {
		super();
	}
	public Inventory(String productName, Date putDate, int putAmout) {
		super();
		this.productName = productName;
		this.putDate = putDate;
		this.putAmout = putAmout;
		getDate =null;
		getAmount =0;
		inventoryAmount =0;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getPutDate() {
		
		return putDate;
	}
	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	public int getPutAmout() {
		return putAmout;
	}
	public void setPutAmout(int putAmout) {
		this.putAmout = putAmout;
	}
	public int getGetAmount() {
		return getAmount;
	}
	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}
	public int getInventoryAmount() {
		return inventoryAmount;
	}
	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	@Override
	public String toString() {
	
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 ");
		String formatDate =sdf.format(putDate);
		 String formatDate2 = (getDate != null) ? sdf.format(getDate) : "null";
		 if(productName.equals("삼성 갤럭시S7"))
		return productName+"       "+formatDate+"입고, " +putAmout+"개, " +formatDate2 +", "+getAmount+"개,"+inventoryAmount+" 개";
		 else if(productName.equals("LG G5"))
			return productName+"            "+formatDate+"입고, " +putAmout+"개, " +formatDate2 +", "+getAmount+"개,"+inventoryAmount+" 개";
		 else
			 return productName+"    "+formatDate+"입고, " +putAmout+"개, " +formatDate2 +", "+getAmount+"개,"+inventoryAmount+" 개";
	}
	
	
	
	
	
}
