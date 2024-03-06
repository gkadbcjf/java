package com.kh.Test24012522;

public class LibraryController {
	private Member mem = null;
	private Book[] bList; //생성자로 해도 된다.
	
	//insertMember(null);
	//insertMember(new Member()); 둘 다 가능
	
	public LibraryController(){
		bList =new Book[5];
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		//Member m1 = new Member();
		//Member m2 = m1;
		//return m2; 으로 리턴해도된다.
		
		return this.mem;
	} 
	
	public Book[] selectAll() {
		return this.bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] tmpArr =new Book[5];
		int count = 0;
		for(int i=0; i<bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				tmpArr[count++] = bList[i];
			}
		}
		return tmpArr;
	}
	
	public int rentBook(int index) {
		int result =0;
		
		if(bList[index] instanceof AniBook) {
			AniBook aniBook =(AniBook)bList[index];
			if(mem.getAge()<aniBook.getAccessAge()) {
				result =1;
			}
		}else if(bList[index] instanceof CookBook){
			CookBook cookBook =(CookBook)bList[index];
			if(cookBook.isCoupon()) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result=2;
			}
		}
		return result;
	}

}
