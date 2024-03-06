import java.util.Scanner;

public class ControllAndLoop02 {

	public static void main(String[] args) {
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고,
		 * 사용자에게는 직접 가위바위보를 받으세요. 사용자가 "exit"를 입력하기 전까지 가위바위보를 계속 진행하고 "exit"가 들어가면 반복을
		 * 멈추고 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 * 
		 */
		Scanner input = new Scanner(System.in);

		String user;
		int user_score = 0, com_score = 0, count = 0, same = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = input.nextLine();

		while(true) {
			
			System.out.print("가위바위보 : ");
			user = input.nextLine();
			if(user.equals("exit")){
				break;
			}else {
			int rand = (int) (Math.random() * 3 + 1);
			String com;
			if (rand == 1)
				com = "가위";
			else if (rand == 2)
				com = "바위";
			else
				com = "보";
			System.out.printf("컴퓨터 : %s\n", com);
			System.out.printf("%s : %s\n", name, user);
			
			if(user.equals(com)) {
				System.out.println("비겼습니다.");
				same++;	
				count++;
			}
			else if(user.equals("가위")&&com.equals("보")||
					user.equals("바위")&&com.equals("가위")||
					user.equals("보")&&com.equals("가위")) {
				System.out.println("이겼습니다!");
				user_score++;
				count++;
			}
			else if(user.equals("가위")&&com.equals("바위")||
					user.equals("바위")&&com.equals("보")||
					user.equals("보")&&com.equals("가위")) {
				System.out.println("졌습니다ㅠㅠ");
				com_score++;
				count++;
			}
			else {
				System.out.println("잘못입력했습니다. 다시입력해주세요.");
	
			}
			System.out.println(count+"번 째");
			System.out.println("=================\n");
			}
		} 

		System.out.printf("%d전 %d승 %d무 %d패", count, user_score, same, com_score);

	}

}
