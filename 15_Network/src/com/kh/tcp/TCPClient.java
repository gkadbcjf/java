package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BufferedReader br = null;
		PrintWriter pw = null;

		//Socket socket = null;
		// 서버 ip ; 192.168.15
		// 포트번호 :4000
		int port = 3000;

		String serverIP = "192.168.30.15";
	
		// 1) 서버에 연결 요청 보내는 구문(요총하고자하는 서버의 IP주소와 지정된 포트번호를 제시하면 된다.)
		try {
			String serverIP2 = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP2, port);
			
			if (socket != null) { // 서버와 잘 연결된 경우
				System.out.println("서버와 연결 성공!!");

				// 2) 서버와 입출력기반 스트림 생성
				// 3) 보조스트림활용해서 성능개선

				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				while(true) {
					//4) 스트림을 통해서 읽고 쓰기
					System.out.print("서버에게 보낼 내용 : ");
					String sendMeString = sc.nextLine();
					pw.println(sendMeString);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버로부터 전달받은 메세지 : " + message);
				}
			}
			// 만약에 통신이 실패했다면 null값이 socket객체에 담긴다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pw.close();
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}
	}
}
