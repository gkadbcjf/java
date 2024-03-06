import java.util.ArrayList;
import java.util.List;

public class GenericListRun {

	public static void main(String[] args) {
		// <Music>으로 제너릭 설정 => E => Music		
		ArrayList<Music> list =new ArrayList<>();
		ArrayList list2 = new ArrayList<>();
		
		list.add(new Music("비의 랩소디","임재현"));
		list.add(new Music("에피소드","이무진"));
		list.add(new Music("헤어지자 말해요","이무기"));
		list2.add(new Music("비의 랩소디","임재현"));
		list2.add(new Music("에피소드","이무진"));
		list2.add(new Music("헤어지자 말해요","이무기"));
//		list.add("끝");
		
		System.out.println(list+"\n");
		
		for(Music tmp : list) {
			
			System.out.println(tmp);
		}
		/*
		 *  *제네릭<>을 사용하는 이유
		 *  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 *  2. 컬렉션에 저장된 객체를 열어서 사용할 때 매번 형변환하는 절차를 없애기 위해서
		 *  
		 */
		

		
		
	}

}
