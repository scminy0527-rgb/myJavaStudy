package chat02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {
	public static void main(String[] args) {
//		SERVER 소켓을 먼저 만듬
		
		String clientMessage = null, serverMessage = null;
		System.out.println("서버가 시작되었습니다. 클라아언트를 기다리는 중....");
		try(
			ServerSocket serverSocket = new ServerSocket(1100);	
			Socket socket = serverSocket.accept();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			Scanner sc = new Scanner(System.in);
		){
			System.out.println("클라이언트가 연결 되었습니다.");
			
			while(true) {
				clientMessage = bufferedReader.readLine();
				System.out.println("[클라이언트]: " + clientMessage);
				
				System.out.println("클라이언트에게 메세지");
				serverMessage = sc.nextLine();
				bufferedWriter.write(serverMessage + "\n");
				bufferedWriter.flush();
				System.out.println("[서버]: " + serverMessage);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
