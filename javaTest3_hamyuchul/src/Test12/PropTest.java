package Test12;


import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2"); 
		//System.out.println();
		
//		/*prop저장된 요소들을 Enumeration을 이용해 출력*/
//		Enumeration enumeration =prop.propertyNames(); //key만 모아서 가져오고 싶으면 propertyNames()
// 		while (enumeration.hasMoreElements()) {
//            String element = (String) enumeration.nextElement();
//            System.out.println(element + "=" + prop.getProperty(element));
//            //prop.getProperty(key) => value 가져오고 있다.
// 		}
		
		
		fileSave(prop);
		fileOpen(prop);
	}
	
	
	public static void fileOpen(Properties p) {
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
			Enumeration enumeration =p.propertyNames();
			Fruit[] f = new Fruit[p.size()];
			
			for(Fruit f_arr: f) {
				String key =(String)enumeration.nextElement();
				String value =p.getProperty(key);
				String[]values =value.split(",");
				f_arr =new Fruit(values[0],Integer.parseInt(values[1]),
						Integer.parseInt(values[2]));
				System.out.println(key +"=" +f_arr.toString());
			}
			
	
			
			
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	
	
	public static void fileSave(Properties p) {

		try {
			p.storeToXML(new FileOutputStream("data.xml") , null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
