package com.kh.Test240125;

public class LibraryController {
	private Member mem = null;
	private Book[] bList = new Book[5];
	{
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
		return mem;
	}

	public Member getMem() {
		return mem;
	}

	public void setMem(Member mem) {
		this.mem = mem;
	}

	public Book[] getbList() {
		return bList;
	}

	public void setbList(Book[] bList) {
		this.bList = bList;
	}

	public int rentBook(int index) {
		int k=mem.getCouponCount();
		int result = 0;
		
			if ( bList[index] instanceof AniBook) {
				if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
					result =1;
					
				}

			} else if ( bList[index] instanceof CookBook) {
				if(((CookBook)bList[index]).isCoupon() ==true){
					result =2;
					mem.setCouponCount(++k);
					
				}
			}
		
		return result;
		
	}

//	public Member myInfo() {
//		return ;
//	}

}
