package Test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date birth =new Date(1987-1900,5-1,27);
		Date today =new Date();
		SimpleDateFormat f1 = new SimpleDateFormat(" yyyy년 MM월 dd일 E요일");
		SimpleDateFormat f2 = new SimpleDateFormat(" yyyy년 MM월 dd일");
		
		System.out.println("생일 : "+f1.format(birth));
		
		System.out.println("현재 : "+f2.format(today));
		//birth.setDate(birth.getDate()+(29*365));
		System.out.println("나이 : " +(today.getYear()-birth.getYear())+"세");
		
		
		
		
	}

}
