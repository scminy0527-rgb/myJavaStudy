package ncsPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		String serverMsg = null, clientMsg = null;
//		1. 소켓부터 내놓아야함
		
		try(
				ServerSocket serverSocket = new ServerSocket(1100);
				Socket socket = serverSocket.accept();
				
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				Scanner sc = new Scanner(System.in);
				){
			
			
//			사용자한테 메세지를 보내기
			System.out.println("서버 개설 성공... 클라이언트 연결 성공");
			while(true) {
//				사용자가 보낸 메세지 읽기
				clientMsg = bufferedReader.readLine();
				System.out.println("[사용자]: " + clientMsg);
				
				System.out.println("사용자한테 보낼 메세지 입력");
				serverMsg = sc.nextLine();
				bufferedWriter.write(serverMsg + "\n");
				bufferedWriter.flush();
				
				System.out.println("[서버]: " + serverMsg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
