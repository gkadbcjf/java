package com.kh.A_File;

import java.io.File;
import java.io.IOException;

public class Run {
	
	/*
	 * 간단하게 파일(File)을 만들어 보자
	 * java.io.File 클래스를 가지고
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		// 1. 경로지정을 딱히 하지않고 파일을 생성
		File f1 = new File("D:\\test.text"); // 파일객체를 하나 만든상태(실제 파일x)
		try {
			f1.createNewFile(); // 메소드까지 실행을 해야만 파일이 만들어진다.
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
		*/
		File f1 = new File("D:\\test.text");
		//2. 존재하는 폴더에 파일 생성 => 해당경로까지 지정
		File f2 = new File("D:\\test.text"); // 파일객체를 하나 만든상태(실제 파일x)
		try {
			f2.createNewFile(); // 존재하지 않는 경로로 제시 => IOException
			
//			File f3 =new File("D:\\tmp\\test.txt");
//			f3.createNewFile();  tmp폴더가 없으므로 에러뜸
			
			// 3. 폴더 먼저 만들고 파일까지 만들어지게 하는 방법
			File tmpFolder =new File("D:\\tmp");
			tmpFolder.mkdir(); //이러면 폴더가 만들어지는 매소드
			
			File f3 =new File("D:\\tmp\\test.txt");
			f3.createNewFile();  
			
			
			System.out.println("존재유무확인 : " +f1.exists()); //파일의 존재유무확인
			System.out.println(new File("ttt.txt").exists());
			
			
			System.out.println("파일인지 ?:"+f1.isFile()); //파일인지 확인하는 메소드
			System.out.println(tmpFolder.isFile());
			
			
			//---------------------------------------------------------
			File folder =new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " +file.getName());
			System.out.println("절대경로 : " +file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
