package kh.model.vo.Food;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FoodController {
	public void fileSave(String fileName) {
		try {
			
			File f =new File(fileName);
			FileOutputStream fop =new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fop);
			oos.writeObject(new Food("사과",20));
			oos.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
