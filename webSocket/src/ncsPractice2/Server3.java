package ncsPractice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server3 {
	public static void main(String[] args) {
		int port = 1100;
		String clientMessage = null, serverMessage = null;
		
		System.out.println("클라이언트 연결 대기중...");
		try(
				ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("클라이언트 연결 성공");
			while(true) {
				clientMessage = bufferedReader.readLine();
				System.out.println("[클라이언트]: " + clientMessage);
				System.out.println("보낼 메세지 입력");
				serverMessage = sc.nextLine();
				bufferedWriter.write(serverMessage + "\n");
				bufferedWriter.flush();
				System.out.println("[서버]: " + serverMessage);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
