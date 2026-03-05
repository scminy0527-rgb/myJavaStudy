package chat01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
//		SERVER 소켓을 먼저 만듬
		
		String message = null;
		
		System.out.println("서버가 시작되었습니다. 클라아언트를 기다리는 중....");
		try(
			ServerSocket serverSocket = new ServerSocket(1100);	
			Socket socket = serverSocket.accept();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		){
			System.out.println("클라이언트가 연결 되었습니다.");
			message = bufferedReader.readLine();
			System.out.println("클라이언트로부터 온 메세지: " + message);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
