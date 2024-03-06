package com.kh.Test240122;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 정수 n(2~9)를 입력받아 2분터 n까지의 짝수의 구구단을 출력하는 함수를 작성하세요. 
		// 만약 2~9사이의 값을 입력하지 않았다면 다시입력해주세요를 반복합니다.
		Scanner input = new Scanner(System.in);
		/*
		int n;
		while(true) {
			System.out.print("정수 입력 : ");
			n = input.nextInt();
			if(n >1 && n <10)
				break;
			else
				System.out.println("다시 입력해주세요.");
		}
		
		for(int i=2; i<=n; i++) {
			if(i%2==0) {
				for(int j=1; j<10; j++) {
					int result = i*j;
					System.out.printf("%d * %d = %d\n",i,j,i*j);
				}System.out.println();
			}
			
				
		}
		
		
		
		
		
		// 정수 num을 입력받아 크기가 num인 정수형 배열을 만들고 1~100사이의 랜덤값으로 모든 배열의 값을 대입합니다.
		// 이후 모든 배열의 홀수인덱스의 값을 더한 값을 구하세요.
		System.out.print("정수 입력 : ");
		int[] num = new int [input.nextInt()];
		
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			num[i] =  (int)(Math.random()*100+1);
			if(num[i]%2==1)
				sum+=num[i];
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : " + sum +"\n");
		

		
		
		
		// 다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요.
		// TV myTV =new TV("삼성",2020,65);
		// myTV.show();
		// => 삼성에서 만든 2020년 65인치 TV
		 
		TV myTV =new TV("삼성",2020,65,100000);
		myTV.show();
		TV myTV2 =new TV("LG",2024,85,200000);
		myTV2.show();
		
		//one이라는 Humna객체를 생성하고
		//해당객체로 myTV와 myTV2구매가 가능한지 확인
		Human one = new Human("함유철",150000);
		one.buy(myTV);
		one.buy(myTV2);
		
		
		
		Human choi =new Human("최지원",15000);
		System.out.println(choi.count);
		Human kim =new Human("김지원",15000);
		System.out.println(kim.count);
		*/ 
		
		//======================================================================
		
		/*
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
		 * 해당 클래스는 도서관에 책을 등록할 떄 사용하는 book객체를 생성할 Book 클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자
		 * 
		 */
		
		// 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		// book객체를 생성하고 생성된 객체의 toString메소드를 호출하여 정보를 확인해주세요.
		Book[] bookArr = new Book[100];
		String title, genre, author; //제목
		int number,count=0,menu=0;
		boolean tobeContinue = true;	
			
		while(menu != 9) {
			System.out.println("=============도서관리 프로그램==========");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서목록출력");
			System.out.println("3. 도서검색");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택() : ");
			menu = input.nextInt();
			switch(menu) {
				case 1:
					System.out.print("도서 제목 : ");
					title =input.next();
					
					System.out.print("장르 : ");
					genre =input.next();
					
					System.out.print("저자 : ");
					author =input.next();
					
					System.out.print("책 번호 : ");
					number =input.nextInt();
					
					bookArr[count++] = new Book(title,genre,author,number);
					System.out.println("도서등록 완료 : " + bookArr[count-1].toString());
					
					break;
				case 2:
					for(int i=0; i<count; i++) {
						System.out.println(bookArr[i].toString());
					}
					break;
				case 3:
					System.out.println("==================도서 검색=====================");
					System.out.print("검색할 도서 제목 : ");
					title=input.next();
					Book target =null;
					for(int i=0; i<count; i++) {
						if(bookArr[i].getTitle().equals(title)) {
							target = bookArr[i];
							break;//만약 찾았다면 target=>null
						}
					}
					if( target == null)
						System.out.println("동일한 제목의 도서가 없습니다.");
					else
						System.out.println("검색 도서 정보 : "+target.toString());
								
					break;
				case 9:
					
					System.out.println("프로그램 종료합니다.");
				System.out.println();
			}

			
		}
		

		
	}

}
