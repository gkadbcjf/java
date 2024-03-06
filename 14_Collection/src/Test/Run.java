package Test;

import java.util.HashMap;


public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Farm, Integer> hMap = new HashMap<>();
		hMap.put(new Fruit("과일","사과"), 500);
	
		System.out.println(hMap.containsKey(new Fruit("과일","사과")));
	}

}
