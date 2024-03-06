package com.kh.B_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudtFile {

	public static void main(String[] args) {
		Product phone1 = new Product("아이폰1",1000000);
		Product phone2 = new Product("아이폰2",2000000);
		Product phone3 = new Product("아이폰3",3000000);
		
		try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("d_product.txt"));) {
			oos.writeObject(phone1);
			oos.writeObject(phone2);
			oos.writeObject(phone3);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois =new ObjectInputStream(new FileInputStream("d_product.txt"));) {
			while(true) {
				System.out.println(ois.readObject());
			}
		}catch(EOFException e) {
			System.out.println("파일을 읽어왔습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
