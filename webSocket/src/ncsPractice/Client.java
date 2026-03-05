package ncsPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

// 10.62.232.102
public class Client {
	public static void main(String[] args) {
		
		int port = 1100;
		String ip = "10.62.232.102";
		String clientMsg = null, serverMsg = null;
		
		System.out.println("서버에 연결 시도....");
		try(
				Socket socket = new Socket(ip, port);
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				Scanner sc = new Scanner(System.in);
				
				){
			
			System.out.println("서버에 연결 완료");
			while(true) {
				System.out.println("서버에 보낼 메세지를 입력하세요");
				clientMsg = sc.nextLine();
				bufferedWriter.write(clientMsg + "\n");
				bufferedWriter.flush();
				System.out.println("[클라이언트]: " + clientMsg);
				
				serverMsg = bufferedReader.readLine();
				System.out.println("[서버]: " + serverMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
