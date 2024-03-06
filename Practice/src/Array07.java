import java.util.Scanner;

public class Array07 {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		String []chicken = {"후라이드","양념","간장","파닭","뿌링클"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = input.nextLine();
		int check=0;
		for(int i=0; i<chicken.length; i++) {
			if(str.equals(chicken[i])) {
				System.out.println("양념치킨 배달 가능띠");
				check=1;
				break;
			}
		}
		if(check ==0)
			System.out.printf("%s치킨은 없는 메뉴입니다.",str);
		*/
		
		Scanner sc =new Scanner(System.in);
		boolean isTrue=false;
 		
		String[] menu = {"후라이드","양념","간장","반반","핫후라이드","슈프링양념"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String pick = sc.next();
		
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals(pick)) {
				isTrue = true;
				break;
			}
			
		}
		System.out.print((isTrue?pick+"치킨 배달 가능 ": pick+"치킨은 없는 메뉴입니다."));
				
		
		
		
		
		
	}

}
