package com.kh.Test240201;

import java.io.File;
import java.util.Scanner;

public class FileMenu {
	private Scanner sc;
	private FileController fc;

	public FileMenu() {
		this.sc = new Scanner(System.in);
		this.fc = new FileController();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기\n2. 노트 열기\n3. 노트 열어서 수정하기\n9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}

	public void fileSave() {
		String str = "";
		StringBuilder stb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			str = sc.next();
			if (str.equals("ex끝it"))
				break;
			stb.append(str).append("\n");
		}

		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String f_str = sc.next();

			if (fc.checkName(str)) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char yn = sc.next().toLowerCase().charAt(0);

				if (yn == 'y') { //파일명이 존재시
					fc.fileSave(f_str, stb);
					break;
				} else if (yn == 'n') {
					continue;
				} else
					System.out.println("잘못 입력하셨습니다.");
			} else {
				fc.fileSave(f_str, stb);
				break;
			}

		}

	}

	public void fileOpen() {
		System.out.print("열 파일 명 : ");
		String str_f = sc.next();
		if (fc.checkName(str_f)) {
			System.out.println(fc.fileOpen(str_f));
		} else {
			System.out.println("없는 파일입니다.");
		}

	}

	public void fileEdit() {
		System.out.print("수정할 파일 명: ");
		String str_f = sc.next();
		if (fc.checkName(str_f)) {
			String str = "";
			StringBuilder stb = new StringBuilder();
			while (true) {
				System.out.println("파일에 저장할 내용을 입력하세요.");
				System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
				System.out.print("내용 : ");
				str = sc.next();
				if (str.equals("ex끝it"))
					break;
				stb.append(str).append("\n");
			}
			fc.fileEdit(str_f, stb);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}

}
