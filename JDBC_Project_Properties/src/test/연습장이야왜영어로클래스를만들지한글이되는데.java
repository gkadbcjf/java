package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class 연습장이야왜영어로클래스를만들지한글이되는데 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop_st  =new Properties();
		try {
			prop_st.store(new FileOutputStream("resources/studytest.properties"), "그래임마");
			prop_st.storeToXML(new FileOutputStream("resouces/querytest.xml"), "그랜마");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
