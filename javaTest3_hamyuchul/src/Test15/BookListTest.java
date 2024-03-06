package Test15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookListTest  {

	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book> list =new ArrayList<Book>();
		
		test5.storeList(list);
		test5.saveFile(list);
		
		List<Book> booksList =test5.loadFile();
		
		test5.printList(booksList);

	}
	
	
	public static void storeList(List<Book> list) {
		list.add(0, new Book("자바의 정석","남궁성",30000,"도우출판",0.15));
		list.add(1, new Book("열혈강의 자바","구정은",29000,"프리렉",0.2));
		list.add(2, new Book("객체지향 JAVA8","금영욱",30000,"북스홈",0.1));
	}
	
	public static void saveFile(List<Book> list) {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));
			oos.writeObject(list);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Book> loadFile(){
		

		
		try {
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream("books.dat"));
			while(true) {
				return (List<Book>) ois.readObject();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void printList(List<Book> list) {
		
		for(Book b : list) {
			int sale=(int)(b.getPrice()*b.getDiscountRate());
			System.out.println(b.toString() +" \n할인된 가격 : " +(b.getPrice()-sale));
		}
	}
}
