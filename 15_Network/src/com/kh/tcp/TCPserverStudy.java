package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPserverStudy {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		BufferedReader br=null;
//		PrintWriter pw=null;
//		int port = 3000;
//		ServerSocket server;
//		try {
//			server = new ServerSocket(port);
//			System.out.println("클라이언트 요청 대기중..");
//			Socket socket = server.accept();
//			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함");
//			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			pw = new PrintWriter(socket.getOutputStream());
//			while (true) {
//				String message = br.readLine();
//				System.out.println("클라이언트로부터 전달받은 메제지 : " + message);
//				System.out.print("클라이언트에게 보낼 내용 : ");
//				String sendMessage = sc.nextLine();
//				pw.println(sendMessage);
//				pw.flush();
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			pw.close();
//
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		Scanner sc =new Scanner(System.in);
//		BufferedReader br = null;
//		PrintWriter pw =null;
//		Socket socket = null;
//		int port =3000;
//		String serverIP ="192.168.30.15";
//		try {
//			socket =new Socket(serverIP,port);
//			if(socket != null) {
//				System.out.println("서버와 연결 성공!!");
//				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				pw = new PrintWriter(socket.getOutputStream());
//				
//				while(true) {
//					System.out.print("서버에게 보낼 내용 : ");
//					String message =sc.nextLine();
//					pw.println(message);
//					pw.flush();
//					
//					String message1 =br.readLine();
//					System.out.println("서버로부터 전달받은 메세지 : " +message1);
//					
//					
//				}
//			}
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			pw.close();
//			try {
//				br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		sc.close();
	}
}
