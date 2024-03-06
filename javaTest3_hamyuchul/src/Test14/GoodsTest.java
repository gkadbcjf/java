package Test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods = null;
		try (BufferedReader br =new BufferedReader(new InputStreamReader(System.in));){
			
			
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			String name = br.readLine();
			System.out.print("가격 : ");
			int price = Integer.parseInt(br.readLine());
			System.out.print("수량 : ");
			int quantity =Integer.parseInt(br.readLine());
			
			goods = new Goods(name,price,quantity);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString()+"\n" +"총 구매 가격 : "+(goods.getQuantity()*goods.getPrice())+"원");   
		
	}

}
