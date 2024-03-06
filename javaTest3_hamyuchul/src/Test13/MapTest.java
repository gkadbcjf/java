package Test13;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Inventory> map =new HashMap<String, Inventory>();
		map.put("삼성 갤럭시S7   ", new Inventory("삼성 갤럭시S7",new Date(2016-1900,3-1,15),30));//2016. 03. 15 
		map.put("LG G5        ", new Inventory("LG G5",new Date(2016-1900,2-1,25),20));//
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro",new Date(2016-1900,1-1,23),15));
		
	
		
		map.entrySet().forEach(entry ->{
			System.out.println(entry.getValue());
			
			
		});
		System.out.println("출고 수량 10 적용시--------------------------------------------");
		Date d =new Date();
		
		
		Inventory[] ivt = map.values().toArray(new Inventory[3]);;
		try {
			for(int i=0; i<ivt.length; i++) {
				ivt[i].setGetDate(d);
				if(ivt[i].getPutAmout()>=10) {
					ivt[i].setGetAmount(10);
					ivt[i].setInventoryAmount(ivt[i].getPutAmout()-10);
					
					System.out.println(ivt[i].toString());
				}
				else {
					throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
				}	
			}
		}catch(AmountNotEnough e) {
			 
		}
	
		
		
    
 		
	}

}
