package chat01;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {
	public static void main(String[] args) {
//		ip, port 누구의 아이피, 누구의 포트인 지 (접속 할)
//		192.168.161.230
		String serverIp = "192.168.161.231";
		int port = 1100;
		Scanner sc = new Scanner(System.in);
		
		try(
				Socket socket = new Socket(serverIp, port);
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				){
			System.out.println("서버가 연결되었습니다.");
			
			String message = sc.nextLine();
			writer.println(message);
			
			System.out.println("서버로 [" + message + "]를 전송하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
